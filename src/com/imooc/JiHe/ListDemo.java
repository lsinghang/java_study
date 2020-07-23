package com.imooc.JiHe;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("java");
    list.add("C");
    list.add("C++");
    list.add("GO");
    list.add("swift");

    // 输出个数
    System.out.println(list.size());

    // 遍历输出集合中的元素
    for (int i = 0; i < list.size() ; i++) {
      System.out.println(list.get(i) + ",");
    }

    // 移出集合元素 下标 0开始
    list.remove(1);
    for (int i = 0; i < list.size() ; i++) {
      System.out.println(list.get(i) + ",");
    }
  }
}
