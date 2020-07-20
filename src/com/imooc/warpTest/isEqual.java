package com.imooc.warpTest;

public class isEqual {
  public static void main(String[] args) {
    Integer one = new Integer(100);
    Integer two = new Integer(200);
    // 因为是new 是开辟新的内存所以不等于
    System.out.println("one == two的结果" + (one == two));


    Integer three = 100; // 自动装箱
    // 实际是执行 Integer three = Integer.valueOf(100)
    System.out.println("three == 100的结果" + (three == 100)); // 自动拆箱

    Integer four = 100;
    // 实际是执行 Integer four = Integer.valueOf(100) 与three的是同一个缓存区
    // -128 至 127内 系统会直接在缓存区里面创建拿去  对象常量池
    System.out.println("three == four的结果" + (three == four));


    Integer five = 200; // 自动装箱
    System.out.println("five == 100的结果" + (five == 200)); // 自动拆箱

    Integer six = 100;
    System.out.println("five == six的结果" + (five == six));



    Double d1 = Double.valueOf(100); // 自动装箱
    System.out.println("d1 == 100的结果" + (d1 == 100)); // 自动拆箱

    // double float 不具备常量池
    Double d2 = Double.valueOf(100); ;
    System.out.println("d1 == d2" + (d1 == d2));
  }
}
