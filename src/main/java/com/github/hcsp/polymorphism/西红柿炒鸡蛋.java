package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜{
    public 西红柿炒鸡蛋(){
        this.verb="炒";
        this.ingredients=new String[]{"鸡蛋","西红柿"};
    }
    //@Override
    public void 做个西红柿炒鸡蛋() {
        super.做一个菜();
    }
}
