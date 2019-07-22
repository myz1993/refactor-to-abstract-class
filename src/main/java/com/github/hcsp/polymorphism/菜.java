package com.github.hcsp.polymorphism;

public class 菜 {
  public void 洗锅(String name) {
    if (name != null) {
      System.out.println("洗" + name.trim() + "锅");
    }
  }

  public void 倒油(String num) {
    if (num != null) {
      System.out.println("倒" + num + "油");
    }
  }

  public void 开始烹饪(String method) {
    if (method != null) {
      System.out.println(method + "啊" + method + "啊" + method);
    }
  }

  public void 放佐料(String name) {
    if (name != null) {
      System.out.println("放" + name);
    }
  }
  public void 出锅(String name) {
    if (name != null) {
      System.out.println(name + "出锅啦");
    }
  }

  public void 做一个菜() {
    System.out.println("做一个菜");
  }
}
