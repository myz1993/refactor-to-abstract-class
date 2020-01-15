package com.github.hcsp.polymorphism;

public class 菜 {
    private String name;
    private String style;

    public 菜(String name,String style) {
        this.name = name;
        this.style=style;
    }

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.println("洗"+ style +"锅");
    }

    public void 倒油() {
        System.out.println("倒油");
    }

    public void 开始烹饪() {
        System.out.println(style+"啊"+style+"啊"+style);
    }

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的" + name + "出锅啦");
    }
}
