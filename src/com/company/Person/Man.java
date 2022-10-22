package com.company.Person;

public class Man extends Person {
  private String role = "父亲";
  private String work = "工程师";
  private String word = "";

  public Man(String name, int age, String role, String work) {
    super(name, age);
    this.role = role;
    this.work = work;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public void manSpeak(String word) {
    //super
    System.out.println("我是谁:" + super.getName() + "男人说话了哦：" + word);
  }

   //重写
    @Override
    public void birthPerson() {
        System.out.println("出生了一个男人");
    }
}
