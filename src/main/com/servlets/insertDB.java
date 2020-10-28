package main.com.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

// Import Database Connection Class file

// Servlet Name
@WebServlet("/InsertToDatabase")
public class insertDB extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) {
        try {

            // Initialize the database
            Connection con = main.com.servlets.MariaConnector.initializeDatabase();

            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used

            PreparedStatement st = con

                    .prepareStatement("INSERT INTO RoForbundet.Athlete values (?, ?, ?, ?)");

            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
            st.setInt(1, Integer.parseInt(request.getParameter("AthleteID")));

            // Same for second parameter
            st.setString(2, request.getParameter("Name"));

            st.setString(3, request.getParameter("Last_Name"));

            st.setString(4, request.getParameter("PhoneNumber"));

            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();

            // Close all the connections
            st.close();
            con.close();

            // Get a writer pointer
            // to display the successful result
            PrintWriter out = response.getWriter();
            out.println("<html>" +
                        "<body>" +
                        "<h1>Successfully Inserted</h1>" +
                        "</body>" +
                        "</html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}