package com.company.MyList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MySet {
  public static void main(String[] args) {
    HashSet set = new HashSet();
    set.add("aaa");
    set.add("bbb");
    set.add(new String("ccc"));
    set.add(new String("ccc"));
    System.out.println(set);
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    linkedHashSet.add("111");
    linkedHashSet.add("222");
    linkedHashSet.add("333");
    linkedHashSet.add(new String("000"));
    linkedHashSet.add(new String("000"));
    System.out.println(linkedHashSet);

    System.out.println(linkedHashSet.toArray()[0]);
  }
}
