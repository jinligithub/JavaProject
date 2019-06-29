package Requset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示数据请求头
        String referce=request.getHeader("referer");
        System.out.println(referce);

        //放盗链
        if(referce!=null){
            if(referce.contains("/Request&Response")){
                //正常访问
                System.out.println("Ok..");
            }else {
                //异常访问
                System.out.println("Error");
            }
        }

        //盗链
        if(referce!=null){
            if(referce.contains("/Request&Response")){
                //正常访问
                response.setContentType("网页链接;字符集");
                response.getWriter().write("播放电影");
            }else {
                //盗链
                response.setContentType("网页链接;charset=utf-8");
                System.out.println("去官网看电影");
            }
        }
    }
}
