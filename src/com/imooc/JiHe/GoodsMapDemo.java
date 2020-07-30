package com.imooc.JiHe;

public class GoodsMapDemo {
  private String id; //商品编号
  private String name; // 商品名称
  private double price;// 商品价格

  public GoodsMapDemo(String id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "GoodsMapDemo{" +
      "商品编号'" + id + '\'' +
      ", 商品名称'" + name + '\'' +
      ", 商品价格" + price +
      '}';
  }
}
