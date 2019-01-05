package jdbcdemo.dao;

import jdbcdemo.ConnectionUtil;
import jdbcdemo.model.Category;
import jdbcdemo.model.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class CategoryDaoImpl extends AbstractDao implements CategoryDao {

    protected CategoryDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public void save(Category category) {
        String sql = "INSERT INTO users VALUES(";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO users(name, login, password) values (?, ?, ?)");
            preparedStatement.setString(1, "nameIDEA");
            preparedStatement.setString(2, "loginIDEA");
            preparedStatement.setString(3, "passwordIDEA");
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Set<Film> findAllFilms(Long categoryId) {
        return null;
    }
}
