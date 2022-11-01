package com.company.IO;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
  public static void main(String[] args) throws IOException {
    String filePath = "C:\\Users\\86178\\Desktop\\a.txt";
    FileWriter fileWriter = null;
    char[] chars = {'a', 'b', 'c'};
    try {
        fileWriter = new FileWriter(filePath);
        fileWriter.write("风雨之后");

        //输出单个字符  单个数组   写入整个字符串    写入指定数组的指定部分
        //f.write('H')
        //f.write(chars)
        //f.write("aaaa", toCharArray(), 0, 3)
        //f.write(String)
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
      fileWriter.close();
    }
  }
}
