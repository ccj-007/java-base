package com.company.Person;

public class Woman extends Person {
    private String role = "母亲";
    private String work = "服务员";
    private String word = "";

    public Woman(String name, int age, String role, String work) {
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
        System.out.println("我是谁:" + super.getName() + "女人说话了哦：" + word);
    }
    //重写
    @Override
    public void birthPerson() {
        System.out.println("出生了一个女人");
    }
}
