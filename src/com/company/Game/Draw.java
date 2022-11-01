package com.company.Game;

import javax.swing.*;

public class Draw extends JFrame {
  private MyPanel mp = null;

  public static void main(String[] args) {
    new Draw();
    System.out.println("退出程序");
  }

  public Draw() {
    mp = new MyPanel();
    this.add(mp);
    this.setSize(400, 400);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
