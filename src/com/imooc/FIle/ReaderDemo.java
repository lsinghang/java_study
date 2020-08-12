package com.imooc.FIle;

import java.io.*;

public class ReaderDemo {
  public static void main(String[] args) throws IOException {
    try {
      FileInputStream fis = new FileInputStream("imooc.txt");
      InputStreamReader isr = new InputStreamReader(fis);
      FileOutputStream fos = new FileOutputStream("immoc1.txt");
      OutputStreamWriter osw = new OutputStreamWriter(fos);

      int n = 0;
      // 方式一:
//      while((n= isr.read()) != -1) {
//        System.out.println((char)n);
//      }

      // 方式二:
      char[] cbuf = new char[10];
      while ((n = isr.read(cbuf)) != -1) {
        String s = new String(cbuf, 0, n); // 转换实际长度
//        System.out.println(s);
        osw.write(cbuf, 0, n);
        osw.flush();
      }
      fis.close();
      fos.close();
      isr.close();
      osw.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
