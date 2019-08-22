package com.github.hcsp.polymorphism;

public class 菜 {
    private String 菜名;
    菜(String 菜名){
        this.菜名 = 菜名;
    }
    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅(菜名);
    }

    public void 洗锅() {
        System.out.println("洗锅");
    }

    public void 倒油() {
        System.out.println("倒油");
    }

    public void 开始烹饪() {}

    public void 放佐料() {}

    public void 出锅(String 菜名) {
        System.out.println("香喷喷的" + 菜名 + "出锅啦");
    }
}
