package com.company.MyThread;

public class URunnable implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
          System.out.println("i===" + i);
        }
    }
}
