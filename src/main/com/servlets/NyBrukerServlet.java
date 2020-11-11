package main.com.servlets;

import main.classes.MariaConnector;
import main.classes.login.Bruker;
import main.classes.login.BrukerDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/nyBruker")
public class NyBrukerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter writer;
        res.setContentType("text/html");
        writer = res.getWriter();

        String epost = req.getParameter("epost");
        String passord = req.getParameter("passord");
        String rettigheter = req.getParameter("rettigheter");

        Bruker bruker = new Bruker(epost, passord, rettigheter);
//create a database model
    try {
        BrukerDB regBruker = new BrukerDB(MariaConnector.initializeDatabase());

        if (regBruker.registrerBruker(bruker)) {
                res.sendRedirect("index.jsp");
        } else {
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("pages/registrerMedlem.jsp");
        }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}