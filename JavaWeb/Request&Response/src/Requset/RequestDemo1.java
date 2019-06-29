package Requset;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet ("/Demo1")
public class RequestDemo1 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//**1. 获取请求方式 ：GET**
//        String getMethod()
//2. (*)获取虚拟目录：/day14**
//        String getContextPath()
// 3. 获取Servlet路径: /demo1**
//        String getServletPath()
// 4. 获取get方式请求参数：name=zhangsan**
//        String getQueryString()
// 5. (*)获取请求URI：/day14/demo1**
//        String getRequestURI():        /day14/demo1
//        StringBuffer getRequestURL()  :http://localhost/day14/demo1
//        URL:统一资源定位符 ： http://localhost/day14/demo1             中华人民共和国
//        URI：统一资源标识符（表示的范围更大） : /day14/demo1                    共和国
// 6. 获取协议及版本：HTTP/1.1**
//        String getProtocol()
// 7. 获取客户机的IP地址：**
//        String getRemoteAddr()

//1. 获取请求方式 ：GET**
        String method=request.getMethod();
        System.out.println(method);
//2. (*)获取虚拟目录：/day14**
        String contextPath=request.getContextPath();
        System.out.println(contextPath);
// 3. 获取Servlet路径: /demo1**
        String servletPath=request.getServletPath();
        System.out.println(servletPath);
// 4. 获取get方式请求参数：name=zhangsan**
        String queryString=request.getQueryString();
        System.out.println(queryString);
// 5. (*)获取请求URI：/day14/demo1**
        StringBuffer requestURL=request.getRequestURL();
        String requestURL1=request.getRequestURI();
        System.out.println(requestURL1);
        System.out.println(requestURL);
// 6. 获取协议及版本：HTTP/1.1
        String protocol=request.getProtocol();
        System.out.println(protocol);
// 7. 获取客户机的IP地址：**
        String remoteAddr=request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
