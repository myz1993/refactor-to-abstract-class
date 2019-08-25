package com.github.hcsp.polymorphism;

public class 煎牛排 extends 菜{

    public 煎牛排() {
        super("煎牛排","煎锅");
    }

    public 煎牛排(String name, String pot) {
        super(name, pot);
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放牛排");
        System.out.println("煎啊煎啊煎");
        System.out.println("放胡椒粉");
    }
}
