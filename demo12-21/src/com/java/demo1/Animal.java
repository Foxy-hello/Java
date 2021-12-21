package com.java.demo1;

public class Animal {
    private String id;
    private String name;
    private String color;
    private int age;

    public void eat(){
        System.out.println("正在吃饭");
    }
    public void show(){
        System.out.println("序号： "+id+" 姓名： "+"颜色： "+color+" 年纪： "+age);
    }

    public Animal(String id, String name, String color, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
