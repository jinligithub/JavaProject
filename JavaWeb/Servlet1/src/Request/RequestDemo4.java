package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示请求头数据referer
        String referer=request.getHeader("referer");
        System.out.println(referer);
        //http://localhost:8080/Servlet1/login.html

        //防盗链
        if(referer!=null){
            if(referer.contains("Servlet1")){
                //正常访问
                System.out.println("播放电影...");
                response.getWriter().write("看电影啊");//输出到页面上
            }else{
                //盗链
                response.getWriter().write("看电影啊");//输出到页面上
                System.out.println("在腾讯视屏看电影吧...");
            }
        }
    }
}
