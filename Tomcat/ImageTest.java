package image;

import java.io.*;
import java.io.FileInputStream;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/image" })

public class ServiceServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ServletOutputStream out = response.getOutputStream();
        String filePath = request.getServletContext().getRealPath("/honey.jpg"); //'/'가 상위 디렉토리 의미
        System.out.println("filePath = " + filePath); //파일 경로 출력
        FileInputStream in = new FileInputStream(filePath);

        int size;
        byte[] data = new byte[1024*8];

        while((size=in.read(data))!=-1) {
            out.write(data,0,size);
            out.flush();
        }
        in.close();
    }
}