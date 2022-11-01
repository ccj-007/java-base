package com.company.IO;

import java.io.File;
import java.io.IOException;

public class MyFile {
  public static void main(String[] args) throws IOException {
    File file = new File("C:\\Users\\86178\\Desktop\\a.txt");
    Boolean result = file.createNewFile();
    System.out.println(result);
  }
}
