package main.com.servlets;

import main.modell.Connector;
import main.modell.loggInn.Bruker;
import main.modell.loggInn.BrukerDB;

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
public class RegisterWebBruker extends HttpServlet { // Extends brukes for å angi superklassen.
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter writer;
        res.setContentType("text/html");
        writer = res.getWriter();


        String epost = req.getParameter("epost");
        String passord = req.getParameter("passord");
        String rettigheter = req.getParameter("rettigheter");

        Bruker bruker = new Bruker(epost, passord, rettigheter);

//Lag en database modell
    try {
        BrukerDB regBruker = new BrukerDB(Connector.initializeDatabase());

        if (regBruker.registrerBruker(bruker)) {
                res.sendRedirect("index.jsp");
        } else {
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("jsp/registrerBruker.jsp");
        }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}