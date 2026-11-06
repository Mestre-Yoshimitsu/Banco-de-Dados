package debian.mavenproject2;

import java.sql.*;

public class ConfigBanco {

    private static String url = "jdbc:postgresql://localhost:5432/Locadora2B";
    private static String username = "postgres";
    private static String password = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
