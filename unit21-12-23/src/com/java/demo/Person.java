package com.java.demo;

public class Person {
    //(3)	Dog类：变量（昵称、健康值、亲密度、品种），输出宠物信息的方法。
    //(4)	Penguin企鹅类：变量（昵称、健康值、亲密度、性别），输出宠物信息的方法。
    //(5)	抽取Dog和Penguin的父类
    private String name;
    private String hea;
    private String love;
    //输出宠物信息的方法
    public void show(){
        System.out.println("昵称： "+name+" 健康值： "+hea+" 亲密度： "+love);
    }

    public Person() {

    }

    public Person(String name, String hea, String love) {
        this.name = name;
        this.hea = hea;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHea() {
        return hea;
    }

    public void setHea(String hea) {
        this.hea = hea;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hea='" + hea + '\'' +
                ", love='" + love + '\'' +
                '}';
    }
}
