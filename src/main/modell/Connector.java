package main.modell;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Denne klassen kan man bruke til å starte opp databasetilkoblingen
public class Connector {
    private static Connection con;

    public static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
    {

        // Finn frem informasjon angående databasetilkoblingen
        String dbDriver = "org.mariadb.jdbc.Driver";
        String dbURL = "jdbc:mariadb://127.0.0.1:3306/RoForbundDB";
        // Databasenavn for å få tilgang
        String dbName = "@DockerDB";
        String dbUsername = "root";
        String dbPassword = "Ex20200702-IS201";

        try {
            Class.forName(dbDriver);

            con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/RoForbundDB?user=root&password=Ex20200702-IS201");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}