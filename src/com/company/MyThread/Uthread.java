package com.company.MyThread;

public class Uthread extends Thread {
    //run在线程执行后的封装代码
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("线程=" + i);
    }
  }
}
