package jdbcdemo.dao;

import jdbcdemo.model.Film;
import jdbcdemo.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
    User findByLogin(String login);
    List<User> findAll();

}
