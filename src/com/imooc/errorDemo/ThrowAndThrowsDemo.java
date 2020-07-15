package com.imooc.errorDemo;

import java.util.Scanner;

/*
*throw 抛出异常对象处理方案:
* 1. try catch 包含throw语句 自己抛自己处理
* 2. 通过throws 在方法声明出抛出异常类型--- 谁调用谁处理
* */

//public class ThrowAndThrowsDemo {
//  public static void main(String[] args) {
//    testAge();
//  }
//
//  public static  void testAge() {
//    try {
//      System.out.println("请输入年龄: ");
//      Scanner input = new Scanner(System.in);
//      int age = input.nextInt();
//      if(age < 18 || age > 80) {
//        throw new Exception("18岁以下, 80岁以上才可以");
//      } else {
//        System.out.println("欢迎");
//      }
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//  }
//}

/*请输入年龄:
2
java.lang.Exception: 18岁以下, 80岁以上才可以
	at com.imooc.errorDemo.customerThrowsDemo.testAge(customerThrowsDemo.java:16)
	at com.imooc.errorDemo.customerThrowsDemo.main(customerThrowsDemo.java:7)*/


public class ThrowAndThrowsDemo {
  public static void main(String[] args) {
    try {
      testAge();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static  void testAge() throws Exception {
      System.out.println("请输入年龄: ");
      Scanner input = new Scanner(System.in);
      int age = input.nextInt();
      if(age < 18 || age > 80) {
        throw new Exception("18岁以下, 80岁以上才可以");
      } else {
        System.out.println("欢迎");
      }
  }
}