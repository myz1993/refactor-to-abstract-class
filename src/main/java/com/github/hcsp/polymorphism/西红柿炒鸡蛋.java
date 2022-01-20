package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜{

    @Override
    public void 洗锅() {
        System.out.println("洗炒锅");
    }

    @Override
    public void 倒油() {
        System.out.println("倒油");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
        System.out.println("炒啊炒啊炒");
    }

    @Override
    public void 放佐料() {
        System.out.println("放盐");
    }

    @Override
    public void 出锅() {
        System.out.println("香喷喷的西红柿炒鸡蛋出锅啦");
    }
}
