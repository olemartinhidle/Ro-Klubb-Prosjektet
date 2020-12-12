package main.kontroller.servlets;

import main.modell.Connector;
import main.modell.forbund.Medlem;
import main.modell.forbund.MedlemDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
//Her hånterer vi det som har med å legge til et nytt medlem
@WebServlet("/regMedlem")
//I og med at man extender HttpServlet lager vi en servlet
public class RegistrerMedlem extends HttpServlet {
    private static final long serialVersionUID = 1L;
//Dette blir registerering, vi putter noe inn, altså en post
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();

//Her lagrer vi de ulike "rutene" fra registrer medlems siden i ulike variabler.Og omgjør om en eventuelt krever en INT
        String medlemsID = req.getParameter("medlemsID");
        int klasseID = Integer.parseInt(req.getParameter("klasseID"));
        int klubbID = Integer.parseInt(req.getParameter("klubbID"));
        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        int født = Integer.parseInt(req.getParameter("fodt"));
        String stilling =req.getParameter("stilling");
        String klubb = req.getParameter("klubb");
        String klasse = req.getParameter("klasse");
//Her lager vi en modell for et medlem til å holde på dataene
        Medlem medlem = new Medlem(medlemsID, klasseID, klubbID, fornavn, etternavn, født, stilling, klubb, klasse);

//Her lager vi en databasemodell som kombineres med den tidligere medlems modellen
        try {
            MedlemDB regMedlem = new MedlemDB(Connector.initializeDatabase());
//Ved suksess sendes man til suksess siden
            if (regMedlem.registrerMedlem(medlem)) {
                res.sendRedirect("view/suksess.jsp");
            } else {
                //Ved feil lages en feilmelding
                String errorMessage = "Bruker ikke tilgjengelig";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("index.jsp");
            }
//Her fanger vi eventuelle exeptions for håndtering
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}