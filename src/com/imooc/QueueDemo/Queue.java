package com.imooc.QueueDemo;

public class Queue {
  private int n;

  //保证两个线程只走一个
  boolean flag = false;

  //加上关键字 synchronized 来同步代码
  public synchronized int getN() {

    if(!flag) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("消费: " + n);
    flag = false;
    notifyAll(); // 避免两个进程 死锁(同时等待)
    return n;
  }

  public synchronized void setN(int n) {
    if(flag) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("生成: " + n);
    this.n = n;
    flag = true;
    notifyAll();
  }
}
