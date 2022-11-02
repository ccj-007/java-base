package com.company.MyReflect;

public class Reflect01 {
  public static void main(String[] args) throws ClassNotFoundException {
    // 1. Class.forName
    String classAllPath = "com.company.Test11";
    Class<?> cls1 = Class.forName(classAllPath);
    System.out.println(cls1);

    // 2. class
    Class cls2 = Test11.class;

    // 3. getClass
      Test11 test11 = new Test11("11" );
      Class cls3 =  test11.getClass();

    // 4. 类加载器
/*
      ClassLoader classLoader = Test11.getClass().getClassLoader();
      Class<?> cls4 = classLoader.loadClass(classAllPath);*/

      //5. 基本数据类型通过反射获取类对象

      Class<Integer> integerClass = int.class;
      Class<Character> characterClass = char.class;

      //6. 基本数据类型的包装类

      Class<Integer> type = Integer.TYPE;

  }
}
