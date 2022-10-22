package com.company.Enum;

public class Main {

  public static void main(String[] args) {
    Gender spring = Gender.SPRING; // 不用调用
    Gender winter = Gender.WINTER;
    System.out.println(winter.name());
    System.out.println(winter.ordinal());
    // ordinal 获取枚举对象的编号, 默认从0 开始
    // valueOf 将字符串转成枚举对象，enum有对应关系

    // compareTo 通过编号对比
    // name  当前枚举的名称
    // values 获取枚举类的所有常量

    // 增强for循环
    System.out.println(spring);
    Gender[] genderArr = Gender.values();
    for (Gender g : genderArr) {
      System.out.println("i=" + g.name());
    }
  }
}
