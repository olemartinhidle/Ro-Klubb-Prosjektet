package main.kontroller.servlets;

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
//Hånderer "Register deg" funksjonen til index siden
@WebServlet("/nyBruker")
//I og med at man extender HttpServlet lager vi en servlet
public class RegisterWebBruker extends HttpServlet { // Extends brukes for å angi superklassen.
    private static final long serialVersionUID = 1L;
//Her ønsker vi registrere en bruker, og vil derfor post e noe
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter writer;
        res.setContentType("text/html");
        writer = res.getWriter();

    //Her henter vi parameterene fra rutene inne på "Register deg" siden
        String epost = req.getParameter("epost");
        String passord = req.getParameter("passord");
        String rettigheter = req.getParameter("rettigheter");
    //Her lager vi en brukermodell og sier hva slags data vi ønsker
        Bruker bruker = new Bruker(epost, passord, rettigheter);


    try {
        //Her lager vi en databasemodell for bruker
        BrukerDB regBruker = new BrukerDB(Connector.initializeDatabase());
        //Hvis funksjonen er godkjent vil man videresendt til logg inn siden
        if (regBruker.registrerBruker(bruker)) {
                res.sendRedirect("index.jsp");
        } else {
            //Hvis man ikke får brukeren godkjent, lages en session for å klargjøre feilen, kan så legges til error melding
                String errorMessage = "Bruker ikke tilgjengelig";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                //Bruker sendes så rett tilbake til registereringssiden for å få prøve på nytt
                res.sendRedirect("view/registrerBruker.jsp");
        }
        //Her fanger vi exeptions, for eventuell håndtering
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}