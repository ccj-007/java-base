package com.company.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properies01 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\86178\\Desktop\\a.properties"));
    String line = null;
    while((line = br.readLine()) != null) {
        String[] split = line.split("=");
        if("ip".equals(split[0])) {
          System.out.println(split[0] + '=' + split[1]);
        }
    }
    br.close();
  }
}
