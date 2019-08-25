package com.github.hcsp.polymorphism;

public class 菜 {

    /**
     * 菜名
     */
    private String name;

    /**
     * 炒菜锅的类型
     */
    private String pot;

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.println("洗"+this.pot);
    }

    public void 倒油() {
        System.out.println("倒油");
    }

    public void 开始烹饪() {}

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的"+this.name+"出锅啦");
    }

    public 菜() {
    }

    public 菜(String name, String pot) {
        this.name = name;
        this.pot = pot;
    }

    public String getPot() {
        return pot;
    }

    public void setPot(String pot) {
        this.pot = pot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
