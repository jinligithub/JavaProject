package com.bite.FactoryMode.AbstractFactoryMode;

public class Test {
    public static void main(String[] args) {
        FactoryA factoryA=new FactoryA();
        factoryA.manufactory();

        FactoryB factoryB=new FactoryB();
        factoryB.manufactory();
    }
}
