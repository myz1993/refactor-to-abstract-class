package com.github.hcsp.polymorphism;

public abstract class 菜 {
    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅(){
        System.out.println("洗炒锅");
    }

    public void 倒油() {
        System.out.println("倒油");
    };

    abstract void 开始烹饪();

    public void 放佐料() {
        System.out.println("放盐");
    };

    abstract void 出锅();
}
