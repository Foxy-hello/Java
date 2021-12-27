package com.java.demo;

public class Pen extends Stationery{
    //笔类（Pen）：
    //继承文具类，实现展示方法
    //拥有颜色属性
    //提供无参和有参构造，提供get/set方法
    private String color;   //提供颜色属性
    @Override
    void show() {
        System.out.println("名称： "+getName()+" 价格： "+getPrice()+" 数量： "+getNumber()+" 颜色: "+color);
    }
    //有参 无参构造方法

    public Pen() {

    }

    public Pen(String color) {
        this.color = color;
    }

    public Pen(String name, double price, int number, String color) {
        super(name, price, number);
        this.color = color;
    }

    //get set方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

