package com.imooc.ThreadDemo;

class MyThread extends Thread {
  public void run() {
    System.out.println("该线程正在执行 ! ");
  }
}

class MyThread1 extends Thread {
  public MyThread1(String name) {
    super(name); // 调用Tread父类的方法
  }
  public void run() {
    for (int i = 0; i <10 ; i++) {
      // 继承Thread 直接调用父类的 getName
      System.out.println(getName() + "正在运行" + i);
    }
  }
}

public class ThreadFirst {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    mt.start(); // 启动线程
    MyThread1 mt1 = new MyThread1("线程1");
    MyThread1 mt2 = new MyThread1("线程2");
    mt1.start();
    mt2.start();

  }
}
