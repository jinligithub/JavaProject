package www.com.Response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo6")
public class ResponseDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //设置编码
        response.setContentType("text/html;charset=utf-8");
        //1.获取字节输出流
        ServletOutputStream sos=response.getOutputStream();
        //2.输出数据
        sos.write("hello".getBytes());
        sos.write("你好 ".getBytes());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
