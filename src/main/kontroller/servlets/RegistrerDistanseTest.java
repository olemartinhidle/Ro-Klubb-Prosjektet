package main.kontroller.servlets;

import main.modell.Connector;
import main.modell.forbund.DistanseDB;
import main.modell.forbund.DistanseTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
//Her håndterer man det om å registere en distansetest, altså flytte data skrevet inn i web app til DB
@WebServlet("/regDist")
//I og med at man extender HttpServlet lager vi en servlet
public class RegistrerDistanseTest extends HttpServlet {
    private static final long serialVersionUID = 1L;
//Dette blir da en post ettersom vi putter noe data inn
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();
//Her henter og lagrer vi de ulike rutene fra web app, og omgjør noen av stringene til Int er
        String testID = req.getParameter("testID");
        int medlemsID = Integer.parseInt(req.getParameter("medlemsID"));
        int femtusenWatt  = Integer.parseInt(req.getParameter("femtusenWatt"));
        String femtuseniTid = req.getParameter("femtuseniTid");
        int totusenWatt = Integer.parseInt(req.getParameter("totusenWatt"));
        String totuseniTid = req.getParameter("totuseniTid");
        int sekstiWatt =Integer.parseInt( req.getParameter("sekstiWatt"));

        //Her lages det en distansetest modell
        DistanseTest distansetest = new DistanseTest(testID, medlemsID, femtusenWatt, femtuseniTid, totusenWatt, totuseniTid, sekstiWatt);
        //Her kombinerer vi den samme modellen med en DistanseTest database håndterer modell
        try {
            DistanseDB regDist = new DistanseDB(Connector.initializeDatabase());
            //Om prosessen blir vellykket sendes man videre til en egen side som innformerer oss om suksess
            if (regDist.registrerDistanseTest(distansetest)) {
                res.sendRedirect("view/suksess.jsp");
            } else {
                //Om noe skulle gå galt så lages en feilmelding
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("view/leggTilDistanseTest.jsp");
            }
//Her fanger vi eventuelle exeptions for håndtering
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}