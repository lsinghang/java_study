package com.imooc.errorDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 通过throws抛出异常时, 针对可能出现的多种异常的情况, 解决方案:
 * 1. throws后面接多个异常类型, 中间用逗号分隔
 * 2. throws后面接异常父类Exception
 *
 * */

//public class throwsDemo {
//    public static void main(String[] args) {
//        try {
//            int result = test();
//            System.out.println("one 和 two 的商是: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("除数不允许为零");
//            e.printStackTrace();
//        } catch (InputMismatchException e) {
//            System.out.println("请输入整数");
//            e.printStackTrace();
//        }
//        test();
//    }
//
//    public static int test() throws ArithmeticException, InputMismatchException {
//        Scanner input = new Scanner(System.in);
//        System.out.println("=====运算开始======");
//        System.out.println("请输入第一个整数");
//        int one = input.nextInt();
//        System.out.println("请输入第二个整数");
//        int two = input.nextInt();
//        return one/two;
//    }
//}

public class throwsDemo {
  public static void main(String[] args) throws Exception {
    try {
      int result = test();
      System.out.println("one 和 two 的商是: " + result);
    } catch (ArithmeticException e) {
      System.out.println("除数不允许为零");
      e.printStackTrace();
    } catch (InputMismatchException e) {
      System.out.println("请输入整数");
      e.printStackTrace();
    } catch (Exception e) {  // 当抛出异常是父类 Exception时 catch必须有Exception类型不然会报错

    }
    test();  // Exception含有检查异常
  }

/** 文档注释
 * @return 两个接收数据的商
 * @throws ArithmeticException
 * @throws InputMismatchException
 *
 */

  public static int test() throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("=====运算开始======");
    System.out.println("请输入第一个整数");
    int one = input.nextInt();
    System.out.println("请输入第二个整数");
    int two = input.nextInt();
    return one/two;
  }
}
