package main.com.servlets;

import main.classes.login.Users;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
    private static  final  long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
            response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            String epost, passord, msg;
            //Henter ut brukernavn og passord
            epost = request.getParameter("Epost");
            passord = request.getParameter("Passord");
            msg = Users.AuthenticateMember(epost, passord);
            if (msg.equals("Korrekt")) {
                session.setAttribute("Epost", epost);
                request.getRequestDispatcher("pages/home.jsp").forward(request, response);
        }
                else {
            }
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }}
}
