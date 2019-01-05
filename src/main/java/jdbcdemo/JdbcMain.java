package jdbcdemo;

import jdbcdemo.dao.UserDao;
import jdbcdemo.dao.UserDaoImpl;
import jdbcdemo.model.User;
import jdbcdemo.service.UserService;
import jdbcdemo.service.UserServiceImpl;

public class JdbcMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl(ConnectionUtil.getConnection());
        UserService userService = new UserServiceImpl(userDao);

        User loginOne = userService.findByLogin("loginOne");
        System.out.println(loginOne.toString());
    }
}
