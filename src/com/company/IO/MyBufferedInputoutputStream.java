package com.company.IO;

import java.io.*;

public class MyBufferedInputoutputStream {
  public static void main(String[] args) {
    String srcFilePath = "C:\\Users\\86178\\Desktop\\a.png";
    String destFilePath = "C:\\Users\\86178\\Desktop\\a2.png";
    BufferedInputStream fileInputStream = null;
    BufferedOutputStream fileOutputStream = null;
    try {
      fileInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
      fileOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

      // 定义个字节数组
      byte[] bytes = new byte[1024];
      int readLen = 0;
      while ((readLen = fileInputStream.read(bytes)) != -1) {
        fileOutputStream.write(bytes, 0, readLen);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fileInputStream != null) {
          fileInputStream.close();
        }
        if (fileOutputStream != null) {
          fileOutputStream.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
