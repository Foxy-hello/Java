package com.java.demo;

public class Person {
    //(1)Dog类：变量（昵称、健康值、亲密度、品种），输出宠物信息的方法。
    //(2)Penguin企鹅类：变量（昵称、健康值、亲密度、性别），输出宠物信息的方法。
    //(3)抽取Dog和Penguin的父类

    private String name;    //昵称
    private String health;  //健康值
    private String love;    //亲密度
    //定义展示方法
    public void show(){
        System.out.println("昵称： "+name+" 健康值： "+health+" 亲密度："+love);
    }
    //无参构造
    public Person() {

    }
    //有参构造
    public Person(String name, String health, String love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }
    //get set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }
    //to String方法

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", health='" + health + '\'' +
                ", love='" + love + '\'' +
                '}';
    }
}
