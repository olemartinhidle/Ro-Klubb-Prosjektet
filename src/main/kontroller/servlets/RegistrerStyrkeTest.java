package main.kontroller.servlets;

import main.modell.Connector;
import main.modell.forbund.StyrkeDB;
import main.modell.forbund.StyrkeTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
//Samme som ved distansetest, vi skal registere en styrketest
@WebServlet("/regStyrke")
//I og med at man extender HttpServlet lager vi en servlet
public class RegistrerStyrkeTest extends HttpServlet {
    private static final long serialVersionUID = 1L;
//Dette blir også da en post ettersom vi putter noe inn
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();

//Her henter vi de ulike "rutene" fra utfyllingen på web-appen, og eventuelt omgjør til INT om nødvendig
        String testID = req.getParameter("testID");
        int medlemsID = Integer.parseInt(req.getParameter("medlemsID"));
        String liggiroProsent  = req.getParameter("liggiroProsent");
        int liggiroKG = Integer.parseInt(req.getParameter("liggiroKG"));
        String knebøyiProsent = req.getParameter("kneiProsent");
        int knebøyiKG = Integer.parseInt(req.getParameter("kneiKG"));
        int antallBeveg =Integer.parseInt( req.getParameter("antallBeveg"));

        //Her lages en styrketest modell for å holde på dataene
        StyrkeTest styrketest = new StyrkeTest(testID, medlemsID, liggiroProsent, liggiroKG, knebøyiProsent, knebøyiKG, antallBeveg);

//Her lages en StyrkeTestDatabase modell som sammen med StyrkeTest modellen kan sette noe inn i DB
        try {
            StyrkeDB regStyrke = new StyrkeDB(Connector.initializeDatabase());
//Ved suksess sendes man til suksess siden
            if (regStyrke.registrerStyrkeTest(styrketest)) {
                res.sendRedirect("view/suksess.jsp");
            } else {
                //Ved feil lages en feilmelding
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("index.jsp");
            }
//Her fanger man eventuelle feil for håndtering
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}