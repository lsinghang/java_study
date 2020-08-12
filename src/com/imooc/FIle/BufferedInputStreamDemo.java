package com.imooc.FIle;

import java.io.*;

public class BufferedInputStreamDemo {
  public static void main(String[] args) {
    try{
      FileOutputStream fos = new FileOutputStream("imooc.txt");
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      FileInputStream fis = new FileInputStream("imooc.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);

      bos.write(50);
      bos.write('a');
      bos.flush(); // 强制清空缓冲区 写入文件
      System.out.println(bis.read());
      System.out.println((char)bis.read());
      fos.close();
      bos.close();
      fis.close();
      bis.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
