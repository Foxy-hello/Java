package com.java.demo02;

public class Work extends Person {
    //worker，继承自Person类。重写父类中的speak( )和eat( )方法
    @Override
    public void show(){
        System.out.println("编号: "+getId()+" 姓名： "+getName()+" 类型： "+getType());
    }
    public void eat(){
        System.out.println("在吃饭");
    }
}
