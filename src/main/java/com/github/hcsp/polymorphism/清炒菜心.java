package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜{
    public 清炒菜心(){
        this.verb="炒";
        this.ingredients=new String[]{"青菜"};
    }
    public void 做个清炒菜心() {
        super.做一个菜();
    }
    @Override
    public void 倒油(){
        System.out.println("倒一点点油");
    }
    public void 放佐料(){
        System.out.println("放酱油");
        super.放佐料();
    }

}

