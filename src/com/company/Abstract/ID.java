package com.company.Abstract;

interface II {
  void show();
}

interface III extends II {
    void show2();
}
public class ID implements III {
    @Override
    public void show2() {
      System.out.println("展示了一个明华222222222");
    }

    @Override
    public void show() {
        System.out.println("展示了一个明华");
    }
}
