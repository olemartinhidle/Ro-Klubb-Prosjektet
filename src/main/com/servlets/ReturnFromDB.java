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
                          HttpServletResponse response) {

        ArrayList<Athlete> athlete = new ArrayList<>();

            try (
                    Connection con = main.com.servlets.MariaConnector.initializeDatabase();
                    PreparedStatement st = con.prepareStatement("SELECT AthleteID, Name, Last_Name, PhoneNumber FROM RoForbundet.Athlete");
                    ResultSet rs = st.executeQuery()
            ) {
                while (rs.next()) {
                    Athlete athletes;
                    athletes = new Athlete();
                    athletes.setId(rs.getInt("athleteID"));
                    athletes.setName(rs.getString("name"));
                    athletes.setLastName(rs.getString("last_name"));
                    athletes.setNumber(rs.getString("phoneNumber"));
                    athletes.add(athletes);
                }
                PrintWriter out = response.getWriter();
                out.print(athlete);


            } catch (SQLException | IOException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
        }
    }
