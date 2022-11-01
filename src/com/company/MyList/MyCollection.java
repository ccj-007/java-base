package com.company.MyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyCollection {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add("111");
    arrayList.add("222");
    arrayList.add("333");

    Collections.reverse(arrayList);
    Collections.swap(arrayList, 0, 1);
    System.out.println(arrayList);
    Collections.max(arrayList);

    Collections.replaceAll(arrayList, "111", "TomTom");

    // copy拷贝
    ArrayList arrayList1 = new ArrayList();
    Collections.copy(arrayList1, arrayList);

    // 重写方法
    Collections.max(
        arrayList,
        new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
            return ((String) o2).length() - ((String) o1).length();
          }
        });
  }
}
