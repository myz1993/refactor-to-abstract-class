package com.github.hcsp.polymorphism;

public class 菜 {
    String name;
    String cookMethod;
    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public 菜(String name, String cookMethod) {
        this.name = name;
        this.cookMethod = cookMethod;
    }

    public void 洗锅() {
        System.out.println("洗"+cookMethod+"锅");
    }

    public void 倒油() {
        System.out.println("倒一点点油");
    }

    public void 开始烹饪() {
        System.out.println(cookMethod+"啊"+cookMethod+"啊"+cookMethod);
    }

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的"+name+"出锅啦");
    }
}
