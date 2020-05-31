package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜 {

    public 清炒菜心() {
        super("清炒菜心");
    }

    @Override
    public void 倒油() {
        System.out.println("倒一点点油");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放青菜");
        System.out.println("炒啊炒啊炒");
    }

    @Override
    public void 放佐料() {
        System.out.println("放酱油");
        System.out.println("放盐");
    }

}
