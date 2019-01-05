package jdbcdemo.service;

import jdbcdemo.dao.DataValidationException;
import jdbcdemo.model.User;

import java.util.List;

public interface UserService {
    User findByLogin(String login);
    List<String> getUpperCaseLogin() throws DataValidationException;
}
