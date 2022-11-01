package com.company.IO;

import java.io.*;

public class MyObjectOutputStream {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String filePath = "C:\\Users\\86178\\Desktop\\data.dat";
     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
    oos.writeObject(100);
    oos.close();
    System.out.println("序列化成功");

    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
      objectInputStream.readObject();
    objectInputStream.close();

    System.out.println("反序列化恢复成功");

  }
}
