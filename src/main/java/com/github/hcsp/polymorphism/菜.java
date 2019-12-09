package com.github.hcsp.polymorphism;

public class 菜 {
    private final String name;

    public 菜(String name) {
        this.name = name;
    }

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.println("洗炒锅");
    }

    public void 倒油() {
        System.out.println("倒油");
    }

    public void 开始烹饪() {
        System.out.println("炒啊炒啊炒");
    }

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的" + name + "出锅啦");
    }
}
