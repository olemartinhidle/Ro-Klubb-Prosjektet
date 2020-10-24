package main.com.servlets;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class MariaConnector {
    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
    {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "org.mariadb.jdbc.Driver";
        String dbURL = "jdbc:mariadb://127.0.0.1:3306";
        // Database name to access
        String dbName = "@DockerDB";
        String dbUsername = "root";
        String dbPassword = "Ex20200702-IS201";

        Class.forName(dbDriver);
        Connection con;
        con = DriverManager.getConnection(dbURL + dbName,
                dbUsername,
                dbPassword);
        return con;
    }
}