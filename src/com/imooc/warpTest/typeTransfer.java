package com.imooc.warpTest;

public class typeTransfer {

  public static void main(String[] args) {
    // 基本数据类型转换为字符串
    int t1 = 2;
    String t2 = Integer.toString(t1);
    System.out.println("int类型转换为String类型对象t2=" + t2);
    System.out.println("===================================");

    // 字符串转换为基本数据类型
    // 1. 包装类的parse
    int t3 = Integer.parseInt(t2);

    // 2. 包装类的valueOF 先将字符串转为包装类, 再通过自动拆箱完成基本类型转换
    int t4 = Integer.valueOf(t2);

    System.out.println("string类型转换为int类型对象t3=" + t3);
    System.out.println("string类型转换为int类型对象t4=" + t4);

  }
}

