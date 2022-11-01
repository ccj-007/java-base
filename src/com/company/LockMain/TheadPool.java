package com.company.LockMain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheadPool {

  ExecutorService executorService = Executors.newCachedThreadPool();

/*  executorService.submit(()->{
      System.out.println(Thead.currentThread().getName() + "正在执行中");
  });

    executorService.shutdown();*/
}
