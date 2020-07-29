package com.imooc.String;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("你好");

    // 在字符串后面添加字符串
    str.append(",");
    str.append("imooc!");
    System.out.println("str = " + str);

    // 将英文变大写
    // StringBuilder没有toUp方法

    // 1. 先删除后插入大写
//    System.out.println("替换后" + str.delete(4,8).insert(4, "MOOC"));

    // 2. replace方法
    System.out.println("替换后" + str.replace(4,8,"MOOC"));

    // 取出 "你好" 并输出
    System.out.println(str.substring(0, 2));
  }
}

