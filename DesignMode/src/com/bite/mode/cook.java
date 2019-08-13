package com.bite.mode;

abstract class cook {
    final void prepare(){
        //倒油
        pourOil();
        //热油
        HeatOil();
        //倒入蔬菜
        pourVagetable();
        //放调料
        pourSoure();
        //炒菜
        fry();
    }
    public void pourOil(){
        System.out.println("往锅里面倒入油");
    }
    public void HeatOil(){
        System.out.println("热油");
    }
    abstract void pourVagetable();
    abstract void pourSoure();
    public void fry(){
        System.out.println("炒菜啦~");
    }

}

class BaoCai extends cook{

    @Override
    void pourVagetable() {
        System.out.println("往锅里面倒入包菜");
    }

    @Override
    void pourSoure() {
        System.out.println("往锅里面面倒入葱花");
    }


}


