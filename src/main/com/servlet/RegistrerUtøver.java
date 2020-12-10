package main.com.servlet;

import main.modell.Connector;
import main.modell.hoved.Medlem;
import main.modell.hoved.MedlemDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/regUt")
public class RegistrerUtøver extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();

        String medlemsID = req.getParameter("medlemsID");
        String klasseID = req.getParameter("klasseID");
        int klubbID = Integer.parseInt(req.getParameter("klubbID"));
        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        int født = Integer.parseInt(req.getParameter("fodt"));
        String stilling =req.getParameter("stilling");
        String klubb = req.getParameter("klubb");
        String klasse = req.getParameter("klasse");

        Medlem medlem = new Medlem(medlemsID, klasseID, klubbID, fornavn, etternavn, født, stilling, klubb, klasse);

//create a database model
        try {
            MedlemDB regMedlem = new MedlemDB(Connector.initializeDatabase());

            if (regMedlem.registrerMedlem(medlem)) {
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