package com.bite.FactoryMode.AbstractFactoryMode;

abstract class Factory {
    public abstract Product manufactory();
}
abstract class Product{
    public abstract void show();
}

class ProductA extends Product{

    @Override
    public void show() {
        System.out.println("ProductA");
    }
}

class ProductB extends Product{
    @Override
    public void show() {
        System.out.println("productB");
    }
}

class FactoryA extends Factory{

    @Override
    public Product manufactory() {
        return new ProductA();
    }
}

class FactoryB extends Factory{

    @Override
    public Product manufactory() {
        return new ProductB();
    }
}
