package com.java.demo2;

public class Animal {
    //昵称、年龄、性别
    private String name;
    private int age;
    private String sex;

    public void show(){
        System.out.println("昵称： "+name+" 年纪： "+" 性别： "+sex);
    }

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
