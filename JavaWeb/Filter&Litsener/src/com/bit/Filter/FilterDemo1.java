package com.bit.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//@WebFilter("/*")//  /*表示访问所有的资源都会执行过滤器，该注解的作用就是表示哪些代码会执行过滤器
public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //System.out.println("filterDemo1被执行了。。。");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }
    @Override
    public void destroy() {

    }
}
