package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection connection = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bookShop", "root" , "admin123");
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC Driver was not loaded: ");
            ex.printStackTrace();
            System.exit(1);
        } catch (SQLException ex) {
            System.out.println("Connection to BD was not established: ");
            ex.printStackTrace();
            System.exit(1);
        }

    }

    public static Connection getConnection() {
        return connection;
    }
}
