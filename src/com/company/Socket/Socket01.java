package com.company.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket01 {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9999);
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
    inputStream.close();
    socket.close();
    serverSocket.close();
  }
}
