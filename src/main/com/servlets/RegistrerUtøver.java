package main.com.servlets;

import main.classes.ConnectorTester;
import main.classes.hoved.Medlem;
import main.classes.hoved.MedlemDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/RegistrerUtøver")
public class RegistrerUtøver extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();

        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        int født = Integer.parseInt(req.getParameter("født"));
        String klubb = req.getParameter("klubb");
        Medlem medlem = new Medlem(fornavn, etternavn, født, klubb);
//create a database model
        try {
            MedlemDB regMedlem = new MedlemDB(ConnectorTester.initializeDatabase());

            if (regMedlem.registrerMedlem(medlem)) {
                res.sendRedirect("pages/home.jsp");
            } else {
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("pages/registrerUtøver.jsp");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}