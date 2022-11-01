package com.company.MyThread;

import java.util.concurrent.FutureTask;

public class Main {
  public static void main(String[] args) {
    /* Uthread t1 = new Uthread();
    Uthread t2 = new Uthread();

    t1.run();  //run 没有开启线程     start 开启线程
    t1.start();
    t2.start();*/

    /*    URunnable mr = new URunnable();
    Thread t1 = new Thread(mr);
    t1.start();*/

    UCallable uCallable = new UCallable();
    FutureTask<String> ft = new FutureTask<>(uCallable);
    Thread thread = new Thread(ft);  //创建线程对象，开启线程
    thread.start();
  }
}
