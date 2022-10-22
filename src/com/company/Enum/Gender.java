package com.company.Enum;

public enum Gender {
  SPRING("春天", "温暖"),
  WINTER("冬天", "寒冷");

  private String name;
  private String desc;

  private Gender(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "Gender{" + "name='" + name + '\'' + ", desc='" + desc + '\'' + '}';
  }
}
