package com.company.Instance;

public class SingleTon01 {
    private String name;
    private static SingleTon01 singleTon01 = null;

    public SingleTon01(String name) {
         this.name = name;
    }

    public static SingleTon01 getInstance() {
        if(singleTon01 == null) {
            singleTon01 = new SingleTon01("小姑娘");
        }
       return singleTon01;
    }
}
