package main.com.servlets;

import main.classes.Connector;
import main.classes.hoved.StyrkeDB;
import main.classes.hoved.StyrkeTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/regStyrke")
public class RegistrerStyrkeTest extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();


        int testID = Integer.parseInt(req.getParameter("testID"));
        int medlemsID = Integer.parseInt(req.getParameter("medlemsID"));
        String liggiroProsent  = req.getParameter("liggiroProsent");
        int liggiroKG = Integer.parseInt(req.getParameter("liggiroKG"));
        String knebøyiProsent = req.getParameter("knebøyiProsent");
        int knebøyiKG = Integer.parseInt(req.getParameter("knebøyiKG"));
        int antallBeveg =Integer.parseInt( req.getParameter("antallBeveg"));

        StyrkeTest stest = new StyrkeTest(testID, medlemsID, liggiroProsent, liggiroKG, knebøyiProsent, knebøyiKG, antallBeveg);

//create a database model
        try {
            StyrkeDB regStyrke = new StyrkeDB(Connector.initializeDatabase());

            if (regStyrke.registrerStyrkeTest(stest)) {
                res.sendRedirect("pages/Suksess.jsp");
            } else {
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("index.jsp");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}