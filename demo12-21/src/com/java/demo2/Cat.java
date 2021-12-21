package com.java.demo2;

public class Cat extends Animal{
    private String type;
    //重写父类的方法
    public void show(){
        System.out.println("昵称： "+getName()+" 年纪： "+getAge()+" 性别： "+getSex()+"品种："+type);
    }

    public Cat(String name, int age, String sex, String type) {
        super(name, age, sex);
        this.type = type;
    }
}
