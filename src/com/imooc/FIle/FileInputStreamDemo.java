package com.imooc.FIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
  public static void main(String[] args) {
    // 创建FileInputStream 对象
    try {
      FileInputStream file = new FileInputStream("imooc.txt");
      System.out.println(file);
//      int n = file.read();
      // 读取到有的话是 -1
//      while (n != -1) {
//        System.out.println((char) n);
//        n = file.read();
//      }

      // 简写
//      int n = 0;
//      while((n = file.read()) != -1) {
//        System.out.println((char) n);
//      }

      // Byte 形式
      byte[] b = new byte[100];
      file.read(b);
//      file.read(b,开始, 结束);
      System.out.println(new String(b));

      file.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
