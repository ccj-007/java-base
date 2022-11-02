package com.company.MyReflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReflectionQa {
  public static void main(String[] args) throws IOException {
    // Properties类
    Properties properties = new Properties();
    properties.load(new FileInputStream(("E:\\java-base\\src\\com\\company\\MyReflect\\test.properties")));
    String classfullpath = properties.get("classfullpath").toString();
    String methodName = properties.get("method").toString();

    System.out.println("classfullpath" + classfullpath);
    System.out.println("methodName" + methodName);

    // 2. 创建对象， 传统的方法 行不通 =》反射机制

    // Class cls = Class.forName(classfullpath);

  }
}
