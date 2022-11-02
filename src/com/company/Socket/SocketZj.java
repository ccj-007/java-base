package com.company.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketZj {
  public static void main(String[] args) throws IOException {
      ServerSocket serverSocket = new ServerSocket(10000);
      System.out.println("服务端在9999监听");
      // 如果没有客户端连接， 会阻塞。 有客户端连接，会返回socket对象，程序继续

      Socket socket = serverSocket.accept();
      System.out.println("服务器socket" + socket.getClass());

      InputStream inputStream = socket.getInputStream();
      byte[] buf = new byte[1024];
      int readLen = 0;
      while((readLen = inputStream.read(buf)) != -1) {
          System.out.println(new String(buf, 0, readLen));
      }

      //获取从客户端的输入流，然后返回输出流
      OutputStream outputStream = socket.getOutputStream();
      outputStream.write("hello client".getBytes());
      socket.shutdownInput(); // 关闭标记

      outputStream.close();
      inputStream.close();
      socket.close();
      serverSocket.close();
  }
}
