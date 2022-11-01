package com.company.LockMain;

public class Main {
  public static void main(String[] args) {
 /*   Cooker cooker = new Cooker();
    Consumer consumer = new Consumer();

    consumer.start();
    cooker.start();*/

      Desk desk = new Desk();
      Cooker cooker = new Cooker(desk);
      Consumer consumer = new Consumer(desk);
    cooker.start();
    consumer.start();
  }
}
