package main.com.servlets;

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

@WebServlet("/regDist")
public class RegistrerDistanseTest extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();

        String testID = req.getParameter("testID");
        int medlemsID = Integer.parseInt(req.getParameter("medlemsID"));
        int femtusenWatt  = Integer.parseInt(req.getParameter("femtusenWatt"));
        String femtuseniTid = req.getParameter("femtuseniTid");
        int totusenWatt = Integer.parseInt(req.getParameter("totusenWatt"));
        String totuseniTid = req.getParameter("totuseniTid");
        int sekstiWatt =Integer.parseInt( req.getParameter("sekstiWatt"));

        DistanseTest distansetest = new DistanseTest(testID, medlemsID, femtusenWatt, femtuseniTid, totusenWatt, totuseniTid, sekstiWatt);
//create a database model
        try {
            DistanseDB regDist = new DistanseDB(Connector.initializeDatabase());

            if (regDist.registrerDistanseTest(distansetest)) {
                res.sendRedirect("jsp/suksess.jsp");
            } else {
                String errorMessage = "User Available";
                HttpSession regSession = req.getSession();
                regSession.setAttribute("RegError", errorMessage);
                res.sendRedirect("jsp/leggTilDistanseTest.jsp");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}