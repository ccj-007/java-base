package com.company.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketZjClient {
  public static void main(String[] args) throws IOException {
      Socket socket = new Socket(InetAddress.getLocalHost(), 10000);
      System.out.println("客户端socket返回" +  socket.getClass());
      OutputStream outputStream = socket.getOutputStream();
      outputStream.write("hello server".getBytes());
      outputStream.close();
      socket.shutdownInput();
      //获取与socket关联的输入流， 读取字节，并显示

      //得到输入流，返回输出流
      InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;

    while((readLen = inputStream.read(buf)) != -1) {
      System.out.println(new String(buf, 0, readLen));
    }

    inputStream.close();
    outputStream.close();
    socket.close();
    System.out.println("客户端退出。。。。");
  }
}
