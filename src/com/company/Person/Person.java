package com.company.Person;

public class Person {
  public static String name = "我是人类";
  private int age = 12;
  private final String address = "上海";

  {
    System.out.println("我是代码块");
  }

  public Person(String name, int abirthPersonge) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public  void birthPerson() {
    System.out.println("出生一个人了");
  }

  public void say() {
    System.out.println("出生一个人了");
  }
}
