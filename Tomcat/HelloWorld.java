package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/HelloWorld" })

public class ServiceServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
        System.out.println(request.getRequestURL());
        String urlString = request.getRequestURL().toString();
        String route = urlString.substring(urlString.lastIndexOf("/"));
        PrintWriter out = respons.getWriter();

        switch (route) {
            case "/HelloWorld":
                out.println("Hello World");
                break;
        }
    }
}