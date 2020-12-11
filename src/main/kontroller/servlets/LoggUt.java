package main.kontroller.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//Håndterer dataene far logg ut funksjonen til hjem siden
@WebServlet("/loggUt")
//I og med at man extender HttpServlet lager vi en servlet
public class LoggUt extends HttpServlet {
    private static final long serialVersionUID = 1L;
// Her sender vi en Get istedenfor en post ettersom vi ikke legger noe til, men ønsker noe fra applikasjonen
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        //Her lager vi en ny session som fjerner attributtene fra systemet
        HttpSession session = req.getSession();
        session.removeAttribute("logUser");
        res.sendRedirect("index.jsp");
    }
}