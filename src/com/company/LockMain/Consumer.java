package com.company.LockMain;

public class Consumer extends Thread {
  private Desk desk;

  public Consumer(Desk desk) {
    this.desk = desk;
  }
  // 1. 桌子有吃的判断、 灭有就等、有就吃、吃完通知厨师生成、数量减少
  @Override
  public void run() {
    super.run();
    while (true) {
      synchronized (desk.getLock()) {
        if (desk.getCount() == 0) {
          break;
        } else {
          if (desk.isFlag()) {
            System.out.println("吃货在吃汉堡包");
            desk.setFlag(false);
            desk.getLock().notifyAll();
            desk.setCount(desk.getCount() - 1);
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
