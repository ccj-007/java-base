package com.company.MyList;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapFor {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("邓超", "孙俪");
    map.put("王宝强", "马蓉");
    Set keyset = map.keySet();
    /*// 增强for
    for (Object k :keyset ) {
      System.out.println(k +"-" + map.get(k));
    }
    // 迭代器
    Iterator iterator = keyset.iterator();
    while(iterator.hasNext()) {
      Object key = iterator.next();
      System.out.println(key + "-" + map.get(key));
    }*/
    Set entrySet = map.entrySet();
    for (Object entry : entrySet) {
      // 向下转型
      Map.Entry m = (Map.Entry) (entry);
      System.out.println(m.getKey() + "-" + m.getValue());
    }

    //hashtable线程安全，效率低，null不能作用key
    Hashtable hashtable = new Hashtable();
    hashtable.put("小哥", 1);
    System.out.println(hashtable);
  }
}
