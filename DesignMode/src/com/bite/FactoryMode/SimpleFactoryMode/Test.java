package com.bite.FactoryMode.SimpleFactoryMode;

public class Test {
    public static void main(String[] args) {
        Factory factory=new Factory();
        try{
            factory.manufactory("A").show();
        }catch (NullPointerException e){
            System.out.println("没有该类产品");
        }

        try{
            factory.manufactory("B").show();
        }catch (NullPointerException e){
            System.out.println("没有该类产品");
        }
    }
}
