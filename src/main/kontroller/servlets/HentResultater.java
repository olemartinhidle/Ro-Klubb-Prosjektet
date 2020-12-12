package main.kontroller.servlets;

import main.modell.Connector;
import main.modell.forbund.Resultater;
import main.modell.forbund.ResultaterDB;

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
//Oppretter en ResultaterDB (Modell)
        ResultaterDB rdb = null;
//Try catch løkke for kvalitetssikringen
        try {
            //Her definerer vi en testDB modell
            rdb = new ResultaterDB(Connector.initializeDatabase());
            //Her oppretter vi en test modell og kombinerer test modellen med TestDB modell
            Resultater resultater = rdb.SøkEtterResultater(logFornavn);
            //Her oppretter vi en sessionb som lagrer resultatene for videre bruk, og vi sendes til resultatsiden
            if (resultater != null) {
                HttpSession session = req.getSession();
                session.setAttribute("logTest", resultater);
                res.sendRedirect("view/resultater.jsp");
                //Ved eventuelle feil printes en feilmedling
            } else {
                out.println("Fant ikke bruker");
            }
            //Her håndterer vi eventuelle exeptions
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}