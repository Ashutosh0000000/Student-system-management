import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Dummy login logic
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("student".equals(user) && "1234".equals(pass)) {
            response.getWriter().println("Login successful!");
        } else {
            response.getWriter().println("Login failed!");
        }
    }
}
