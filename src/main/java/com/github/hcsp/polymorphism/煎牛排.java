package com.github.hcsp.polymorphism;

public class 煎牛排 extends 菜 {
    public 煎牛排() {
        super("煎牛排", "煎");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放牛排");
        super.开始烹饪();
    }

    @Override
    public void 放佐料() {
        System.out.println("放胡椒粉");
        super.放佐料();
    }

}
