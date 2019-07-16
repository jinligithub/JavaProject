package com.bit.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

@WebFilter("/*")
public class SensitiveWordFilter implements Filter {
    //敏感词汇的数组
    private List<String> list=new ArrayList<String>();
    public void init(FilterConfig config) throws ServletException {
        try{
            //加载文件真实路径
            ServletContext servletContext=config.getServletContext();
            String realPath=servletContext.getRealPath("/WEB-INF/sensitiveWords");

            //读取文件
            BufferedReader bf=new BufferedReader(new FileReader(realPath));
            //3.将文件每一行添加到List中
            String line=null;
            while((line=bf.readLine())!=null){
                list.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(list);
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.创建代理对象，增强getParameter方法

        ServletRequest peoxy_req=(ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //判断是否是getParameter方法
                if(method.getName().equals("getParameter")){

                  //增强返回值
                    //获取返回值
                    String value=(String)method.invoke(req,args);
                    if(value!=null){
                        for(String st:list){
                            value=value.replaceAll(st,"***");
                        }
                    }
                }
                return method.invoke(req,args);
            }
        });


        //2.放行
        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

}
