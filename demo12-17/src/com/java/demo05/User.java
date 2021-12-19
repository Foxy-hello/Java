package com.java.demo05;

public class User {
    public User(){
        System.out.println("这是一个无参构造方法");
    }
    String name;
    int age;
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
}
