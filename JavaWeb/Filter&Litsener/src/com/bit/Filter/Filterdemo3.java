package com.bit.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class Filterdemo3 implements Filter {
    //在服务器关闭后，Filter对象会被销毁.如果服务器正常关闭，
    public void destroy() {
        System.out.println("destory....");
    }
    //
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter....");
        chain.doFilter(req, resp);
    }
    //在服务器启动之后，会创建Filter对象，然后调用Init方法
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init....");
    }

}
