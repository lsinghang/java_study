package com.imooc.JiHe;

import java.util.*;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, String> animal = new HashMap<String, String>(); // 泛型<key, value>的类型
    System.out.println("请输入三种单词对应的注释, 并存放到HashMap中");
    Scanner console = new Scanner(System.in);

    // 添加数据
    int i = 0;
    while (i < 3) {
      System.out.println("输入key值: ");
      String key = console.next(); // 赋值key
      System.out.println("输入value值: ");
      String value = console.next();
      animal.put(key, value);
      i++;
    }

    // 打印输出value
    System.out.println("=====================");
    System.out.println("使用迭代器输出 打印输出value");
    Iterator<String> it = animal.values().iterator();
    while (it.hasNext()) {
      System.out.println(it.next() + " ");
    }

    // 打印输出key 和 value
    System.out.println("=====================");
    System.out.println("通过entrySet 打印输出key 和 value");
    // <Map.Entry<String, String>> Entry本身要加泛型
    Set<Map.Entry<String, String>> entrySet = animal.entrySet();
    for (Map.Entry<String, String> entry: entrySet) {
      System.out.println("key: " + entry.getKey() + ";  value :" +  entry.getValue());
    }

    // 通过单词找到注释并输出
    // keySet方法
    System.out.println("==========请输入=========");
    String strSearch = console.next();
    // 1.取得keySet
    Set<String> keySet = animal.keySet();

    // 2.遍历keySet
    Boolean isSearch = false;
    for(String key: keySet) {
      if(strSearch.equals(key)) {
        System.out.println("找到了!" + "键值对为: " + key + "-" + animal.get(key));
        isSearch = true;
        break;
      }
    }

    if(!isSearch) {
      System.out.println("没有找到");
    }
  }
}
