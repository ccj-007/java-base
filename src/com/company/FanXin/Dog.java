package com.company.FanXin;

public class Dog<T, R> {
  private T name;
  private R age;

  public Dog(T name, R age) {
    this.name = name;
    this.age = age;
  }

  public T getName() {
    return name;
  }

  public void setName(T name) {
    this.name = name;
  }

  public R getAge() {
    return age;
  }

  public void setAge(R age) {
    this.age = age;
  }
}
