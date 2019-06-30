package www.com.Response;

import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;


@WebServlet("/check")
public class CheckCoder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int width=100;
        int height=50;
        //1.创建一个对象，在内存中图片（验证码对象）
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_3BYTE_BGR);

        //2.美化图片
        //2.1填充背景色
        Graphics g=image.getGraphics();//画笔对象
        g.setColor(Color.PINK);
        g.fillRect(0,0,width,height);
        //2.2花边框
        g.setColor(Color.BLACK);
        g.drawRect(0,0,width-1,height-1);
        //2.3写验证码
        //生成随机角标
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random ran=new Random();
        for(int i=1;i<5;i++){
            //生成下标
            int index=ran.nextInt(str.length());
            //获取字符
            char ch=str.charAt(index);
            //写验证码
            g.drawString(ch+"",width/5*i,height/2);
        }
        //2.4画干扰线
        for (int i=0;i<5;i++){
            //生成随机左边
            int x1=ran.nextInt(width);
            int x2=ran.nextInt(width);
            int y1=ran.nextInt(height);
            int y2=ran.nextInt(height);
            //划线
            g.drawLine(x1,x2,y1,y2);
        }
        //3.将图片输出到页面
        ImageIO.write(image,"jpg",response.getOutputStream());
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}
