package debian.trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConfigBanco {

    private static String url;
    private static String username;
    private static String password;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConfigBanco.url = url;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        ConfigBanco.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ConfigBanco.password = password;
    }
    
}
