package com.imooc.fanxing;

import java.util.List;

public class GoodsSell {
  public void sellGoods(List<? extends Goods> goods) {
    for (Goods g: goods) {
      g.sell();
    }
  }
}
