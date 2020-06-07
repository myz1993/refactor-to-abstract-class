package com.github.hcsp.polymorphism;

public class 菜 {
    private String name;
    private String cookingMethod;

    public 菜(String name, String cookingMethod) {
        this.name = name;
        this.cookingMethod = cookingMethod;
    }

    public 菜(String name) {
        this.name = name;
        this.cookingMethod = "炒";
    }

    //这里是否有必要改成静态工厂方法呢，或是builder?

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.println("洗" + cookingMethod + "锅");
    }

    public void 倒油() {
        System.out.println("倒油");
    }

    public void 开始烹饪() {
        System.out.println(cookingMethod + "啊" + cookingMethod + "啊" + cookingMethod);
    }

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的" + name + "出锅啦");
    }
}
