package com.bite.FactoryMode.SimpleFactoryMode;

abstract class  Product {
    //展示商品
    public  abstract void show();
}

class ProductA extends Product{//商品A
    @Override
    public void show() {
        System.out.println("ProductA");
    }
}

class ProductB extends Product{

    @Override
    public void show() {
        System.out.println("ProductB");
    }
}

class Factory{
    public  static Product manufactory(String productName){
        switch(productName){
            case "A":
                return new ProductA();
            case  "B":
                return new ProductB();
            default:
                    return null;
        }
    }
}

