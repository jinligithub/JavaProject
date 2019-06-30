package www.com.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet("/Demo5")
public class ResponseDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取流对象之前，设置编解码， 默认编码：ISO-8859-1  修改为  GBK
        response.setCharacterEncoding("utf-8");
        //告诉浏览器，服务器发送的消息数据的编码，减一浏览器使用该方式编解码
        response.setHeader("content-type","text/html;charset=utf-8");

        //简单的方法
        response.setContentType("text/html;charset=utf-8");
        //1.获取字符输出流
        PrintWriter pw=response.getWriter();
        //2.输出数据
        pw.write("hello");
        pw.write("你好");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
