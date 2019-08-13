package com.bite.ProxyMode;

public interface Subject {
    //买电脑
    void BuyMac();
}

class RealSubject implements Subject{

    @Override
    public void BuyMac() {
        System.out.println("买一台Mac电脑");
    }
}
class Proxy implements Subject{

    @Override
    public void BuyMac() {
        RealSubject  real=new RealSubject();
        real.BuyMac();
        this.warp();
    }
    public void warp(){
        System.out.println("把电脑包装好");
    }
}
