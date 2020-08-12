package com.imooc.FIle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
  public static void main(String[] args) throws FileNotFoundException {
    FileOutputStream fos;
    try {
      fos = new FileOutputStream("imooc.txt", true);
      fos.write(50);
      fos.write('a');
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
