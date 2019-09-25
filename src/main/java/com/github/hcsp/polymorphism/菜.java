package com.github.hcsp.polymorphism;

public abstract class 菜 {
    public void 做一个菜() {
        洗锅();
        倒油();
        开始烹饪();
        放佐料();
        出锅();
    }

    public void 洗锅() {
        String name = this.getClass().getSimpleName();
        if(name.contains("煎")){
            System.out.println("洗煎锅");
        }else if(name.contains("炒")){
            System.out.println("洗炒锅");
        }else{
            System.out.println("生成错误,请输入你要使用的工具:");
        }
    }

    public void 倒油() {
        System.out.println("倒油");
    }

    public abstract void 开始烹饪();

    public void 放佐料() {
        System.out.println("放盐");
    }

    public void 出锅() {
        System.out.println("香喷喷的"+ this.getClass().getSimpleName()+"出锅啦");
    }
}
