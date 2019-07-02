package www.com.cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
cookie a事务 快速入门
 */
@WebServlet("/demo1")
public class cookieDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建cookie对象
        Cookie cookie=new Cookie("msg","hello");
        //2.发送cookie
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

    }
}
