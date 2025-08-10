//servelet program implementing Servelet interface
import javax.servlet.*;
import java.io.IOException;

public class Myservelet implements Servlet{
    public void init(ServletConfig config) throws ServletException{
        System.out.println("Initialized using init() method");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        //Request handling code
        res.getWriter().println("Hello from service()");
    }

    public void destroy(){
        //cleanup code
    }

    public String getServletInfo(){
        return "My Servlet Info";
    }
}