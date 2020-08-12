package com.imooc.FIle;

import java.io.File;
import java.io.IOException;

public class FileDemo {
  public static void main(String[] args) {
    // 创建File对象
//    File file1 = new File("c:\\imooc\\io\\score.txt");
//    File file1 = new File("c:\\imooc", "io\\score.txt");

//    File file1 = new File("c:\\imooc\\io");

    File file = new File("c:\\imooc");
    File file1 = new File( file, "io\\score.txt");


    // 判断是文件还是目录
    System.out.println("是否是目录: " + file1.isDirectory());
    System.out.println("是否是文件: " + file1.isFile());

    // 创建文件夹
    File file2 = new File("c:\\imooc", "ABC");
    System.out.println(file2);
    // 如果不存在就创建
    if(!file2.exists()) {
      file2.mkdir();
    }

    // 创建多级目录文件夹
    File file3 = new File("c:\\imooc\\123\\345\\789");
    System.out.println(file3);
    // 如果不存在就创建
    if(!file3.exists()) {
      file3.mkdirs(); // mkdirs多级
    }

    // 创建文佳
    if(!file1.exists()) {
      try {
        file1.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
