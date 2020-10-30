package main.com.servlets;

import main.classes.Athlete;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/ReturnTable")
public class ReturnFromDB extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

        PrintWriter  writer = response.getWriter();
        ArrayList<Athlete> athletes = new ArrayList<>();

            try (
                    Connection con = main.com.servlets.MariaConnector.initializeDatabase();
                    PreparedStatement st = con.prepareStatement("SELECT AthleteID, Name, Last_Name, PhoneNumber FROM RoForbundet.Athlete");
                    ResultSet rs = st.executeQuery()
            ) {
                while (rs.next()) {
                    Athlete athlete;
                    athlete = new Athlete();
                    athlete.setId(rs.getInt("AthleteID"));
                    athlete.setName(rs.getString("Name"));
                    athlete.setLastName(rs.getString("Last_Name"));
                    athlete.setNumber(rs.getString("PhoneNumber"));
                    athletes.add(athlete);
                }

                for (Athlete athlete : athletes) {
                    writer.println(athlete);


                    }} catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
    }}