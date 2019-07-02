import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
         1. 可以采用Cookie来完成
        2. 在服务器中的Servlet判断是否有一个名为lastTime的cookie
            1. 有：不是第一次访问
                1. 响应数据：欢迎回来，您上次访问时间为:2018年6月10日11:50:20
                2. 写回Cookie：lastTime=2018年6月10日11:50:01
            2. 没有：是第一次访问
                1. 响应数据：您好，欢迎您首次访问
                2. 写回Cookie：lastTime=2018年6月10日11:50:01

 */
@WebServlet("/test")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //设置响应消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        //获取所有的Cookie
        Cookie[] cookies=request.getCookies();

        //定义标签,默认不存在该cookie的lastTime
        boolean flag=false;

        //2.遍历cookie数组
        if(cookies!=null){
            for(Cookie cookie:cookies){
                //获取cookie的名称
                String name=cookie.getName();
                //判断名称是否是：lastTime
                if("lastTime".equals(name)){
                    //存在该cookie，不是第一次访问
                    flag=true;//有lastTime的cookie

                    //设置cookie的value
                    //获取当前时间的字符串，
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年-mm月-dd日");
                    String str_date=sdf.format(date);
                    //URL编码
                    str_date= URLEncoder.encode(str_date,"utf-8");
                    cookie.setValue(str_date);
                    //设置cookie的存活时间
                     cookie.setMaxAge(60*60*24*30);//一个月
                    response.addCookie(cookie);

                    //响应数组
                    //获取cookie的value，时间
                    String value=cookie.getValue();
                    value= URLDecoder.decode(value,"utf-8");
                    response.getWriter().write("<h1>欢迎回来，上次访问时间"+value+"</h1>");

                    break;
                }
            }
        }
        if((cookies==null)||(cookies.length == 0) || (flag=false)){
            //第一次访问
            //设置cookie的value
            //获取当前时间的字符串，
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy年-mm月-dd日");
            String str_date=sdf.format(date);
            str_date= URLEncoder.encode(str_date,"utf-8");
            Cookie cookie=new Cookie("lastTime",str_date);
            //设置cookie的存活时间
            cookie.setMaxAge(60*60*24*30);//一个月
            response.addCookie(cookie);

            response.getWriter().write("<h1>欢迎第一次访问</h1>");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
