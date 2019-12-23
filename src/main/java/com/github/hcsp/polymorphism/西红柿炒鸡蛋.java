package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜{
    public 西红柿炒鸡蛋() {
        super("西红柿炒鸡蛋", "炒");
    }

    @Override
    public void 倒油() {
        System.out.println("倒油");
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
    }

}
