package com.company;

import com.company.Abstract.IC;
import com.company.Abstract.ID;
import com.company.Enum.Gender;
import com.company.Person.Man;
import com.company.Person.Person;

public class Main {

  public static void main(String[] args) {
    // MyTools myTools = new MyTools();
    // int[][] map = {{0, 1, 1}, {1, 1, 1}, {1, 1, 1}};
    // myTools.printArr(map);
    System.out.println(Person.name);

    Person manPerson = new Man("chen", 12, "青年", "做前端");
    manPerson.birthPerson();
    System.out.println(manPerson instanceof Man);
    String a = new String("2");
    String b = new String("2");
    System.out.println(a.equals(b));
    // System.out.println(Man instanceof manPerson);
    IC ic = new IC();

    // 匿名内部类
    fl(
        new ID() {
          @Override
          public void show() {
            System.out.println("这是一副好画哎哎哎");
          }
        });

    // fl(new ID());
  }

  public static void fl(ID id) {
    id.show();
  }
}
