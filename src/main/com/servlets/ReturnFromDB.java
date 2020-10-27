package main.com.servlets;

import main.classes.Atleets;

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

        ArrayList<Atleets> atleets = new ArrayList<>();

            try (
                    Connection con = main.com.servlets.MariaConnector.initializeDatabase();
                    PreparedStatement st = con.prepareStatement("SELECT AtleetID, Name, Last_Name, PhoneNumber FROM RoForbundet.Atleets");
                    ResultSet rs = st.executeQuery()
            ) {
                while (rs.next()) {
                    Atleets atleet = new Atleets();
                    atleet.setId(rs.getInt("atleetID"));
                    atleet.setName(rs.getString("name"));
                    atleet.setLastName(rs.getString("last_name"));
                    atleet.setNumber(rs.getString("phoneNumber"));
                    atleets.add(atleet);
                }
                PrintWriter out = response.getWriter();
                out.print(atleets);


            } catch (SQLException | IOException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
        }
    }
