import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class MyHttpServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        response.getWriter().println("Hello from doGet()");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().println("Hello from doPost()");
    }
}