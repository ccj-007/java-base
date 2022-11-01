package com.company.LockMain;

public class Cooker extends Thread {
    private Desk desk;

    public Cooker(Desk desk) {
        this.desk = desk;
    }
  // 判断是否有汉堡包、有就等待、没有生成、提醒消费者开吃
  @Override
  public void run() {
    while (true) {
      synchronized (desk.getLock()) {
        if (desk.getCount() == 0) {
          break;
        } else {
          if (!desk.isFlag()) {
            System.out.println("厨师开始生成");
              desk.setFlag(true);
            desk.getLock().notifyAll();
          } else {
            try {
                desk.getLock().wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }
}
