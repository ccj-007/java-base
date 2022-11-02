package com.company.MyReflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflect02 {
  // class类  getName  getFields(public)  getDeclaredFields  getMethods (public)  getDeclaredMethods
  // getConstructors   getDeclaredFields  getInterface  接口信息

  // Field类  getType getName 属性名

  // java.lang.reflect.Method类 getName  getReturnType

  // java.lang.reflect.Constructor类   getName  getParameterTypes

  public static void main(String[] args)
      throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException,
          InstantiationException, NoSuchMethodException, InvocationTargetException {
    // class
    /*  Class cls1 = Test11.class;
    Field age = cls1.getDeclaredField("age");
      age.setAccessible(true);
    Method[] declaredMethods = cls1.getDeclaredMethods();
    for (Method declaredMethod : declaredMethods) {
      System.out.println(declaredMethod.getName());
    }*/

    // 反射访问类中的成员
    Class<?> aClass = Class.forName("com.company.MyReflect.Test11");
    Object o = aClass.getDeclaredConstructor().newInstance(5);
    Field age = aClass.getDeclaredField("age");
    age.setAccessible(true);
    age.set(o, "8888888886");

    System.out.println(age.get(o));
  }
}
