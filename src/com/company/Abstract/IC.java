package com.company.Abstract;

public class IC {
    //匿名内部类， 如果是抽象类，那么需要手动调用一次
    IB ib = new IB("我是发布者IC") {
        @Override
        public  void test() {
            System.out.println("我真的哭了IA");
        }
    };

    //基于抽象类
    IA ia = new IA() {
        @Override
        public  void cry() {
            System.out.println("我真的哭了IA");
        }
    };
    //ia.cry();
}
