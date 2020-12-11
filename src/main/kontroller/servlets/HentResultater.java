package main.kontroller.servlets;

import main.modell.Connector;
import main.modell.forbund.Tester;
import main.modell.forbund.TesterDB;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Håndterer hjem sidens "søk etter test" funksjon
@WebServlet("/søkEtterResultater")
//I og med at man extender HttpServlet lager vi en servlet
public class HentResultater extends HttpServlet {
    private static final long serialVersionUID = 1L;
//Her utfører vi en Post metode, dette ettersom vi "poster" en bestemt ønsket utøver vi vil se resultatene til"
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();


//Lagrer parameteren fra web interfacet i en string variabel
        String    logFornavn = req.getParameter("medlemsID");
//Oppretter en TesterDB (Modell)
        TesterDB tdb = null;
//Try catch løkke for kvalitetssikringen
        try {
            tdb = new TesterDB(Connector.initializeDatabase());

            Tester tester = tdb.SøkEtterResultater(logFornavn);

            if (tester != null) {
                HttpSession session = req.getSession();
                session.setAttribute("logTest", tester);
                res.sendRedirect("view/resultater.jsp");
            } else {
                out.println("user not found");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}