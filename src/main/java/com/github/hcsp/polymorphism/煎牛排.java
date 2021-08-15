package com.github.hcsp.polymorphism;

public class 煎牛排 extends 菜{
    public 煎牛排(){
        this.verb="煎";
        this.ingredients=new String[]{"牛排"};
    }
    public void 煎个牛排() {
        super.做一个菜();
    }
    @Override
    public void 放佐料(){
        System.out.println("放胡椒粉");
        super.放佐料();
    }

}

