package com.github.hcsp.polymorphism;

public class 煎牛排 extends 菜 {

    @Override
    public void 洗锅() {
        System.out.println("洗煎锅");
    }

    public 煎牛排() {
        this("煎牛排");
    }

    public 煎牛排(String name) {
        super(name);
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放牛排");
        System.out.println("煎啊煎啊煎");
    }

    @Override
    public void 放佐料() {
        System.out.println("放胡椒粉");
        super.放佐料();
    }
}
