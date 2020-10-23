package main.com.servlets;

// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LogIn")
public class logIn extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {


        // Set response content type
        response.setContentType("text/html");
        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        out.println("Your username is: ");
        out.println(username);
        out.println("Your password is: ");
        out.println(password);

    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public void destroy() {
        // do nothing.
    }
}