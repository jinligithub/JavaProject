package www.com.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo3")
public class ResponseDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo3来了");
        request.setAttribute("msg","reponse");

        //动态获取虚拟目录
        String contextPath=request.getContextPath();


        //简单的方法获取虚拟目录
        response.sendRedirect(contextPath+"/Demo4");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
