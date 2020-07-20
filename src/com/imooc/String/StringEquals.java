package com.imooc.String;

public interface StringEquals {
  public static void main(String[] args) {
    // == 与equals方法的区别
    // == 地址是否相同
    // equals 内容是否相同

    String str1 = "imooc";
    String str2 = "imooc";
    String str3 = new String("imooc");

    System.out.println("str1  str2" + (str1.equals(str2)));
    System.out.println("str1  str2" + (str1.equals(str3)));
    System.out.println("str1  str2" + (str1 == str2)); // 指向同一个常量池
    System.out.println("str1  str2" + (str1 == str3)); // 地址不相同

  }
}
