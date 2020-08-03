package com.imooc.fanxing;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
  public static void main(String[] args) {
    // 定义book相关的list
    List<Books> books = new ArrayList<>();
    books.add(new Books());
    books.add(new Books());

    // 定义cloths 相关list
    List<Choths> cloths = new ArrayList<>();
    cloths.add(new Choths());
    cloths.add(new Choths());

    // shoes 相关list
    List<Shoes> shoes = new ArrayList<>();
    shoes.add(new Shoes());
    shoes.add(new Shoes());

    GoodsSell goodsSell = new GoodsSell();
    // 输入的泛型类型需要是Goods
    // 1. books 泛型改为 Goods
    // 2. public void sellGoods(List<? extends Goods> goods) {
    goodsSell.sellGoods(books);

  }
}
