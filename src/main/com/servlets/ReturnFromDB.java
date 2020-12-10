
package main.com.servlets;

import main.classes.Athlete;
import main.classes.hoved.DistanseTest;
import main.classes.hoved.StyrkeTest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/visTester")
public class ReturnFromDB extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
/**

        PrintWriter writer = response.getWriter();
        ArrayList<Test> tester;
        StyrkeTest stest = new StyrkeTest();
        styrketester = stest.getStyrkeTest();
        DistanseTest dtest = new DistanseTest();
        distansetester = dtest.getStyrkeTest();

        //request.setAttribute("list", athletes);
        //request.getRequestDispatcher().forward("results.jsp");

        for (Test tester : tester) {
            writer.println(resultater);
        }
         ELNS    */
    }
}