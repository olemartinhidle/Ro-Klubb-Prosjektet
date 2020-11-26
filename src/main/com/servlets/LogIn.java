package main.com.servlets;

import main.classes.ConnectorLogIn;
import main.classes.login.Bruker;
import main.classes.login.BrukerDB;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        //feth data from login form

        String logepost = req.getParameter("epost");
        String logpassord = req.getParameter("passord");

        BrukerDB bdb = null;
        try {
            bdb = new BrukerDB(ConnectorLogIn.initializeDatabase());

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