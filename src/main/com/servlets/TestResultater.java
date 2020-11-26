package main.com.servlets;

import main.classes.ConnectorLogIn;
import main.classes.hoved.Tester;
import main.classes.hoved.TesterDB;
import main.classes.login.Bruker;
import main.classes.login.BrukerDB;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SøkEtterResultater")
public class TestResultater extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        //feth data from login form

        String logFornavn = req.getParameter("fornavn");

        TesterDB tdb = null;
        try {
            tdb = new TesterDB(ConnectorLogIn.initializeDatabase());

            Tester tester = tdb.SøkEtterResultater(logFornavn);

            if (tester != null) {
                HttpSession session = req.getSession();
                session.setAttribute("logTest", tester);
                res.sendRedirect("pages/home.jsp");
            } else {
                out.println("user not found");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}