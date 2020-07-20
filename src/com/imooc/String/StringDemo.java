package com.imooc.String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringDemo {

  public static void main(String[] args) {
    String str = "JAVA变成字符串";
    // 长度
    System.out.println(str.length());

    // 取出字符
    System.out.println(str.charAt(3));

    // 取出子串输出
    System.out.println(str.substring(2));

    // 取出子串
    System.out.println(str.substring(5, 7));

    // indexOf()
    // 查找A 第一次出现的位置
    System.out.println("第一次" + str.indexOf("A"));

    // 查找A 最后一次出现的位置
    System.out.println("最后一次" + str.lastIndexOf("A"));

    // 在字符串index值为3开始 查找A 第一次出现的位置
    System.out.println("最后一次" + str.indexOf("A", 2));


    // 字符串转换byte
    byte [] arrs = str.getBytes();
    for(int i=0; i< arrs.length; i++) {
      System.out.println(arrs[i] + " ");
    }

    // byte 转换 字符串(前提是编码方式一致 如UTF-8)
    System.out.println(new String(arrs));
  }
}
