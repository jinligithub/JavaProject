package com.bit.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//
//@WebFilter("/index.jsp")//1. 具体资源路径： /index.jsp   只有访问index.jsp资源时，过滤器才会被执行
//@WebFilter("/user/*")//2. 拦截目录： /user/*	访问/user下的所有资源时，过滤器都会被执行
//@WebFilter("*.jsp ")	//3. 后缀名拦截： *.jsp		访问所有后缀名为jsp资源时，过滤器都会被执行
//@WebFilter("/*")///4. 拦截所有资源：/*		访问所有资源时，过滤器都会被执行

public class FilterDemo4 implements Filter {

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filterDemo4.。。");
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

}
