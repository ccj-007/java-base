package com.company.LockMain;

public class Desk {
  // 定义一个标记, false 就表示桌子上没有汉堡包，允许厨师执行
  /*  public static boolean flag = false;
  public static int count = 10;

  // 锁对象
  public static final Object lock = new Object();*/

  private boolean flag = false;

  private int count = 10;

  private final Object lock = new Object();

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public Object getLock() {
    return lock;
  }

  @Override
  public String toString() {
    return "Desk{" + "flag=" + flag + ", count=" + count + ", lock=" + lock + '}';
  }


}
