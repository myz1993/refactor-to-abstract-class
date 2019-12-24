package com.github.hcsp.polymorphism;

public abstract class 菜 {

    private String name;

    菜(String name) {
        this.name = name;
    }

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public abstract void 洗锅();

    public abstract void 倒油();

    public abstract void 开始烹饪();

    public abstract void 放佐料();

    public void 出锅() {
        System.out.println("香喷喷的" + name + "出锅啦");
    }
}
