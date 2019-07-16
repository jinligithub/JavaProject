package com.bit.proxy;
//真是对象
public class Dell implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"买电脑");
        return "Dell电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑");
    }
}
