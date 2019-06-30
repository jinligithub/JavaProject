package www.com.Response;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向
 */
@WebServlet("/demo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("demo1被访问了。。。。");
       //方法一：
        //设置状态码
        response.setStatus(302);
        //设置重定向路径
        response.setHeader("location","/Response_02/demo2");

        //方法二：简单的重定向
        response.sendRedirect("/Response_02/demo2");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}
