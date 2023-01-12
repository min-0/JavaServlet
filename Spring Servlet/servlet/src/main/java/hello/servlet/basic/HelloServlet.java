package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServelt", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //Ctrl + O
        System.out.println("HelloServlet.service"); //soutn
        System.out.println("req = " + req); //soutv
        System.out.println("resp = " + resp);

        //"http://localhost:8080/hello?username=kim" 요청청 url에 파미터가 담겨있을 때 파싱하는 법
        String username = req.getParameter("username"); //ctrl + art + v
        System.out.println("username = " + username); //soutv

        //응답 메세지 생성
        resp.setContentType(("text/plain"));
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello " + username);
    }
}
