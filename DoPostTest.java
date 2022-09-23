package DoPostTest;
import java.net.URLDecoder;
import java.io.*;
import java.io.FileInputStream;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/input"}) 

public class DoPostTest extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>"
        +"<html>"
            +"<head>"
                + "<meta charset = 'UTF-8'>"
                + " <title>input</title>"
            + "</head>"
            + "<body>"
                + "<form name = 'name' method='post' action = '/doposttest/input' enctype='UTF-8'>"
                   +" 이름: <input type='text' name = 'NAME'/> <br>"
                    + "<input type='submit' value='submit'/>"
                 + "</form>"
            + "</body>"
        +" </html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            System.out.println(request.getRequestURL()); 
            String urlString = request.getRequestURL().toString();
            String route = urlString.substring(urlString.lastIndexOf("/"));
            switch(route){
                case "/input":
                this.putName(request, response);
                break;

            }
        }
        catch(Exception e){}
        
    
    
    }
    private void putName(HttpServletRequest request,HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("NAME");
        out.print("이름: " + name);
        out.close();
    }
        
        
      
}
