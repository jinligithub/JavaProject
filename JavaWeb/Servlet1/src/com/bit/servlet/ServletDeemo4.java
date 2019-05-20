package com.bit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//Servlet的路径配置
//@WebServlet({"/d4","/dd4","/dddd4"})
//@WebServlet("/user/demo4")
@WebServlet("/user/*")
public class ServletDeemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4....");
    }
}
