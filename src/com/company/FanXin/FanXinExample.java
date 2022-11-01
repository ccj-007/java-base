package com.company.FanXin;

import java.util.ArrayList;

public class FanXinExample<T, K> {
  public static void main(String[] args) {
    ArrayList<Dog> aaa = new ArrayList<Dog>();
    aaa.add(new Dog("aaa", 1));
    aaa.add(new Dog(1, "22323"));
    //如果传入Cat会报错

    //自定义泛型类, 类型在创建时确定，如果没有指定默认为Object, 在接口中只能在方法，不能给静态成员
  }

}
