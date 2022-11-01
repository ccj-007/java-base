package com.company.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedReader {
  public static void main(String[] args) throws IOException {
    String filePath = "C:\\Users\\86178\\Desktop\\a.txt";
    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
    String line;

    while((line = bufferedReader.readLine()) != null) {
      System.out.println(line);
    }

    bufferedReader.close();
  }
}
