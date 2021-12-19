package com.java.demo02;

public class Animal {
    private String name;
    private int age;

    public void show(){
        System.out.println(age+"岁的"+name+" 在汪汪叫");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
