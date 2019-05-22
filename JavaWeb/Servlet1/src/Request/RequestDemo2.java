package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示请求头数据

        //1.获取所有请求头数据
        Enumeration<String> headerName=request.getHeaderNames();
        //2.遍历
        while(headerName.hasMoreElements()){
            String name=headerName.nextElement();
            //根据名称获取请求头数据
            String value =request.getHeader(name);
            System.out.println(name+"---"+value);
        }
    }
}
