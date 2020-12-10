package main.com.servlet;

import main.modell.Connector;
import main.modell.login.Bruker;
import main.modell.login.BrukerDB;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Dette er en posthandler (at du gir noe, som skal respondere)
@WebServlet("/loggInn")
public class LoggInn extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        //feth data from login form
        String logepost = req.getParameter("epost");
        String logpassord = req.getParameter("passord");

        BrukerDB bdb = null;
        try {
            bdb = new BrukerDB(Connector.initializeDatabase());

            Bruker bruker = bdb.logBruker(logepost, logpassord);

            if (bruker != null) {
                HttpSession session = req.getSession();
                session.setAttribute("logUser", bruker);
                res.sendRedirect("pages/home.jsp");
            } else {
                out.println("user not found");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}