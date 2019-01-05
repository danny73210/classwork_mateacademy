package jdbcdemo.service;

import jdbcdemo.dao.DataValidationException;
import jdbcdemo.dao.UserDao;
import jdbcdemo.dao.UserDaoImpl;
import jdbcdemo.model.User;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public List<String> getUpperCaseLogin() throws DataValidationException {
        List<User> userList = userDao.findAll();

        if (userList.size()>2)
            throw new DataValidationException("User list size should not be greater then 2");

        return userList.stream()
                .filter(Objects::nonNull)
                .map(User::getName)
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }
}
