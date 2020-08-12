package com.imooc.FIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputImg {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("happy.png");
      FileOutputStream fos = new FileOutputStream("happyCopy.png");
      int n = 0;
      byte[] b = new byte[1024]; //  设立数组大小
      while((n = fis.read(b))!= -1) { // = -1 到文件末尾
//        fos.write(b);
        // 如果最后字节不足1024就会写入多 所以 从0开始 n读多少就写多少
        fos.write(b, 0, n);
      }
      fis.close();
      fos.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
