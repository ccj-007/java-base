package com.company.Game;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
  public void paint(Graphics g) {
    super.paint(g);
    System.out.println("paint被调用了");
    g.setColor(Color.blue);
    g.drawOval(10, 10, 100, 100);
  }
}
