package com.company.MyList;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    arrayList2.add("okok");

    arrayList.add("jack");
    arrayList.add("tom");
    arrayList.remove(0);
    arrayList.contains("tom");
    arrayList.clear();
    arrayList.size();
    arrayList.addAll(arrayList2);
    arrayList.get(0);
    arrayList.set(0, "222");
    arrayList.indexOf("222");
    arrayList.subList(0, 2);

    String[] originList = new String[] {"1", "2"};
    int[] arrInt = {2, 3};

    // for增强功能
    for (Object a : arrayList) {
      System.out.println("Object=" + a);
    }
    // 使用迭代器
    Iterator iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      Object next = iterator.next();
      System.out.println("next=" + next);
    }

    HashMap hashMap = new HashMap();
    hashMap.put("NO1", "北京");
    hashMap.put("NO2", "上海");
  }
}
