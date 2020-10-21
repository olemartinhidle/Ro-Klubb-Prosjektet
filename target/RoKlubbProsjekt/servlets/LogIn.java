// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.https.*;

@WebServlet("/LogIn")
public class LogIn extends HttpServlet {

    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.print(name);
    }

    public void destroy() {
        // do nothing.
    }
}