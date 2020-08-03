package com.imooc.fanxing;

public class CustomsFan<T> {
  private T num;
  public T getNum(){
    return num;
  }
  public void setNum(T num) {
    this.num = num;
  }

  public static void main(String[] args) {
    CustomsFan<Integer> intNum = new CustomsFan<>();
    intNum.setNum(10);
    System.out.println("Integer: " + intNum.getNum());
  }
}
