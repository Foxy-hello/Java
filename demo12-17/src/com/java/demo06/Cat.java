package com.java.demo06;

public class Cat {
    private String name;
    private String age;

    public void show(){
        System.out.println(name+"在喵喵叫 "+age+"岁了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
