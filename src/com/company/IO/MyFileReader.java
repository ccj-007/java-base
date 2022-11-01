package com.company.IO;

import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
  public static void main(String[] args) {
    // 字符流 单个字符 读取a.text显示在控制台上
    String filePath = "C:\\Users\\86178\\Desktop\\a.txt";
    FileReader fileReader = null;
    int data = 0;

    try {
      fileReader = new FileReader(filePath);
      while ((data = fileReader.read()) != -1) {
        System.out.println((char)data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fileReader != null) {
          fileReader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
