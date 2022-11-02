package com.company.MyReflect;

import java.lang.reflect.Field;

public class Test1 {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    // 已知类class  实例getClass   位置  forName
    Class cls2 = Test11.class;

    Field f = cls2.getDeclaredField("name");
    f.setAccessible(true);
    f.set(cls2, "888888888888");
    System.out.println(f.getName());
  }
}
