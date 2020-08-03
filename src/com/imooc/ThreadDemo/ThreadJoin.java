package com.imooc.ThreadDemo;


class MyThread2 extends Thread {
  public MyThread2(String name) {
    super(name); // 调用Tread父类的方法
  }
  public void run() {
    for (int i = 0; i <500 ; i++) {
      // 继承Thread 直接调用父类的 getName
      System.out.println(getName() + "正在运行" + i);
    }
  }
}

public class ThreadJoin {
  public static void main(String[] args) {
    MyThread2 mt1 = new MyThread2("线程1");
    MyThread2 mt2 = new MyThread2("线程2");
    mt1.start();
    try {
      mt1.join(1); // 等待进行
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    mt2.start();

  }
}
