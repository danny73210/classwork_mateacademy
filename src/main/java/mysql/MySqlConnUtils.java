package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnUtils
{
    public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
    {
        String hostName = "localhost";
        String dbName = "bookShop";
        String userName = "root";
        String password = "admin123";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
            throws ClassNotFoundException, SQLException
    {
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysq://" + hostName + ":3306/" + dbName;

        conn = DriverManager.getConnection(connectionURL, userName, password);

        return conn;
    }
}
