/**
package main.com.servlets;

import main.classes.Athlete;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/ReturnTable")
public class ReturnFromDB extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        ArrayList<Athlete> athletes;
        Athlete ath = new Athlete();
        athletes = ath.getUsers();

        //request.setAttribute("list", athletes);
        //request.getRequestDispatcher().forward("results.jsp");

        for (Athlete athlete : athletes) {
            writer.println(athlete);
        }
    }
}
 */