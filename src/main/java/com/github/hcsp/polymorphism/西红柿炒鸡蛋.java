package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜{

    public 西红柿炒鸡蛋() {
        super("西红柿炒鸡蛋","炒锅");
    }

    public 西红柿炒鸡蛋(String name, String pot) {
        super(name, pot);
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
        System.out.println("炒啊炒啊炒");
    }
}
