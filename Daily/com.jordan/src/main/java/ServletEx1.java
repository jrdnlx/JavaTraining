import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class ServletEx1 extends HttpServlet {
    
    public void doGet(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.println("<h1 style='color:blue'><marquee behavior='alternate'>Welcome to the world of Servlets</marquee></h1>");
    }
    
    

 

}