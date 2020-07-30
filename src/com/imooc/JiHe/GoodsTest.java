package com.imooc.JiHe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    // 定义HashMap对象
    Map<String, GoodsMapDemo> goodsMap = new HashMap<String, GoodsMapDemo>();
    System.out.println("请输入三条信息");
    int i = 0;
    while (i < 3) {
      System.out.println("请输入第" + (i + 1) + "条");
      System.out.println("请输入商品编号");
      String goodsId = console.next();
      // 商品id 不能重复 判断存在
      if(goodsMap.containsKey(goodsId)) {
        System.out.println("输入商品编号已经存在");
        continue; // 跳开这次循环
      }
      System.out.println("请输入商品名称");
      String goodsName = console.next();
      System.out.println("请输入商品价格");
      double goodsPrice = 0;
      try {
        goodsPrice = console.nextDouble();
      } catch (java.util.InputMismatchException e) {
        System.out.println("输入格式不正确");
        console.next();
        continue;
      }

      GoodsMapDemo goods = new GoodsMapDemo(goodsId, goodsName, goodsPrice);
      //  将商品信息添加到HashMap中
      goodsMap.put(goodsId, goods); // key value
      i++;
    }

    // 遍历Map, 输出商品信息
    System.out.println("商品的全部信息为: ");
    Iterator<GoodsMapDemo> it = goodsMap.values().iterator();
    while (it.hasNext()) {
      System.out.println(it.next() + "") ;
    }
  }
}
