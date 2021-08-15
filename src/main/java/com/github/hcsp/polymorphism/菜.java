package com.github.hcsp.polymorphism;

public class 菜 {
    public String verb;
    public String[] ingredients;
    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }
    public void 洗锅() {
        System.out.println("洗"+this.verb+"锅");
    }
    public void 倒油() {
        System.out.println("倒油");
    }
    public void 开始烹饪() {
        for(String x:this.ingredients){
            System.out.println("放"+x);
        }
        System.out.println(this.verb+"啊"+this.verb+"啊"+this.verb);
    }
    public void 放佐料() {
        System.out.println("放盐");
    }
    public void 出锅() {
        System.out.println("香喷喷的"+this.getClass().getName().substring(29)+"出锅啦");
    }
}
