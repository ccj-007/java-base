package com.company.MyThread;

import java.util.concurrent.Callable;

public class UCallable implements Callable<String> {
  @Override
  public String call() throws Exception {
    for (int i= 0; i < 100; i++) {
      System.out.println("i---" + i);
    }
    return null;
  }
}
