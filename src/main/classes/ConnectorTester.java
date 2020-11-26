package main.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class ConnectorTester {
    private static Connection conn;

    public static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException {

        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "org.mariadb.jdbc.Driver";
        String dbURL = "jdbc:mariadb://127.0.0.1:3306/RoForbundDB";
        // Database name to access
        String dbUsername = "root";
        String dbPassword = "Ex20200702-IS201";

        try {
            Class.forName(dbDriver);

            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/RoForbundDB?user=root&password=Ex20200702-IS201");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
