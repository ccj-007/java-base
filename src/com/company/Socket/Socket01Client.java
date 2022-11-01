package com.company.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Socket01Client {
  public static void main(String[] args) throws IOException {
      Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
    System.out.println("客户端socket返回" +  socket.getClass());

      OutputStream outputStream = socket.getOutputStream();
  }
}
