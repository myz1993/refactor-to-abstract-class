package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜{


    @Override
    public void 倒油() {
        System.out.println("倒一点点油");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放青菜");
        super.开始烹饪();
    }

    @Override
    public void 放佐料() {
        System.out.println("放酱油");
        super.放佐料();
    }

    @Override
    public void 出锅() {
        System.out.println("香喷喷的清炒菜心出锅啦");
    }
}
