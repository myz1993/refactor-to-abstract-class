package com.github.hcsp.polymorphism;

public class 菜 {
    protected String 菜名;
//    public 菜(String name){}

    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        System.out.print("洗炒锅"+" ");
    }

    public void 倒油() {
        System.out.print("倒油"+" ");
    }

    public void 开始烹饪() {
        //System.out.println("放"+菜名);
        System.out.print("炒啊炒啊炒"+" ");
    }

    public void 放佐料() {
        System.out.print("放盐"+" ");
    }

    public void 出锅() {
        System.out.print("香喷喷的"+菜名+"出锅啦");
    }
}
