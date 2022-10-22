package com.company;

public class MyTools {
  public void printArr(int[][] map) {
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        System.out.println(map[i][j] + "-----");
      }
    }
  }
}
