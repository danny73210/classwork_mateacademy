package jdbcdemo.dao;

import jdbcdemo.ConnectionUtil;
import jdbcdemo.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl extends AbstractDao implements UserDao {

    public UserDaoImpl (Connection connection) {
        super(connection);
    }

    @Override
    public List<User> findAll() {
        return Collections.emptyList();
    }

    @Override
    public User findByLogin(String login) {
        String sql = "SELECT * FROM users WHERE login=\"" + login + "\"";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            return rs.next() ? getUser(rs) : null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("user_id"));
        user.setName(rs.getString("name"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
        user.setSex(rs.getString("sex"));
        return user;
    }

}
