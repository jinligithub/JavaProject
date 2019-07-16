package com.bit.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.swing.text.StringContent;
import java.io.FileInputStream;


public class ContextLoaderListener implements ServletContextListener {

    /*
    监听ServletContext对象的创建，ServletContext服务器启动后自动创建

    在服务器启动后自动调用
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //获取ServletContext对象
        ServletContext servletContext=servletContextEvent.getServletContext();
        //加载资源文件
        String contextConfigLocation=servletContext.getRealPath("/WEB-INF/application.xml");
        //获取真实路径
        String realPath=servletContext.getRealPath(contextConfigLocation);
        //加载进内存
        try{
            FileInputStream fis=new FileInputStream(realPath);
            System.out.println(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ServletContext对象被创建了");
    }
    /*
    在服务器关闭后。ServletContext对象被销毁，当服务器正常关闭后该方法被调用
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁了");

    }
}
