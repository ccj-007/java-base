package com.company.CommonClass;

public class Main {
  public static void main(String[] args) {
      Common common = new Common("okok");
      int a = 2;
      Integer aa = a;
    char b = '2';
    System.out.println(aa.MIN_VALUE);
    System.out.println(aa.MIN_VALUE);
    System.out.println(Character.isDigit('a')); //判断是否是数字
    System.out.println(Character.isLetter('a'));  //是否是字母
    System.out.println(Character.isUpperCase('a'));
    System.out.println(Character.isLowerCase('a'));

    System.out.println(Character.toLowerCase('a'));
    System.out.println(Character.isWhitespace('a'));
  }
}
