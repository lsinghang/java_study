package com.imooc.ThreadDemo;

class PrintRunnable implements Runnable{
  @Override
  public void run(){
    System.out.println(Thread.currentThread().getName()+ "正在运行!");
  }
}

class PrintRunnable1 implements Runnable{
  @Override
  public void run(){
    int i = 1;
    while (i <= 10) {
      System.out.println(Thread.currentThread().getName()+ "正在运行!" + (i++));
      try {
        Thread.sleep(1000); // 休眠
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class ThreadScond {
  public static void main(String[] args) {
    PrintRunnable1 pr = new PrintRunnable1();
//    Thread(Runnable target) 通过这样创建线程
    Thread t1 = new Thread(pr);
    t1.start();

    PrintRunnable1 pr1 = new PrintRunnable1();
//    Thread(Runnable target) 通过这样创建线程
    Thread t2 = new Thread(pr1);
    t2.start();
  }
}
