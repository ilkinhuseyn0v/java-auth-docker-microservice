package az.logintest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://mysql-db:3306/userdb?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "2026";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database qosuldu!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tapilmadi: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Baglanti xetasi: " + e.getMessage());
        }
        return connection;
    }
}
