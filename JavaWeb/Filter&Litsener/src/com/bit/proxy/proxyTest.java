package com.bit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyTest {
    public static void main(String[] args) {
        //1.创建真实对象
        Dell dell=new Dell();

        //2.动态的代理增强Dell对象
        /**
         * 三个参数：
         * 1.类加载器：真实对象：getClass().getClassLoader()
         * 2.接口数组：真实对象:getClass().getInterfaces()  保证了代理对象和真实对象实现了相同的接口
         * 3..处理器：new InvocationHandler（），核心业务逻辑的处理方法
         */
        Proxy.newProxyInstance(dell.getClass().getClassLoader(), dell.getClass().getInterfaces(), new InvocationHandler() {
            /*
            代理逻辑的编写方法，代理对象调用的所有方法多会被执行
             参数：
                 proxy：代理对象
                 method:代理对象调用的方法，被封装从对象（反射里面的）
                 args:代理对象调用的方法时，传递实际参数

             */

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //System.out.println("该方法被执行了");
                //System.out.println(method.getName());
                 //Object obj=method.invoke(args[0]);

                //代码增强
                //判断是否为sale方法
                if(method.getName().equals("sale")){
                    //1.增强参数
                    double money=(double)args[0];
                    money =money*0.85;
                    System.out.println("专车接你");//逻辑增强
                    //使用真实对象调用该方法
                    String obj=(String)method.invoke(dell,money);
                    System.out.println("免费送货");//逻辑增强
                    //2.增强返回值
                    return obj+"—耳机";
                }else {
                    Object obj=method.invoke(dell,args);
                    return obj;
                }

            }
        });
        //2.普通方法，定义方法
          String computer =dell.sale(10000);
        System.out.println(computer);


    }
}
