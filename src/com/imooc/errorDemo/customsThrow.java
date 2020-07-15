package com.imooc.errorDemo;

import java.util.Scanner;

public class customsThrow {
  public static void main(String[] args) {
    try {
      testAge();
    } catch (HotelAgeException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  public static  void testAge() throws HotelAgeException {
    System.out.println("请输入年龄: ");
    Scanner input = new Scanner(System.in);
    int age = input.nextInt();
    if(age < 18 || age > 80) {
      throw new HotelAgeException();
    } else {
      System.out.println("欢迎");
    }
  }
}


class HotelAgeException extends Exception {
  public HotelAgeException () {
    super("18岁以下, 80以上必须陪同");
  }
}

