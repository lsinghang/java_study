package com.imooc.fanxing;

public class CustomsFanMethod {
  // 限制 泛型传入范围 限制number类
  //  public <T extends  Number> void printValue(T t) {
  public <T> void printValue(T t) {
    System.out.println(t);
  }

  public static void main(String[] args) {
    CustomsFanMethod gm = new CustomsFanMethod();
    gm.printValue("123");
    gm.printValue(123);
    gm.printValue(5.0f);
  }
}
