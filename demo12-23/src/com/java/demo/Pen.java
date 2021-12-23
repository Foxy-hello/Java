package com.java.demo;

import javax.naming.Name;

public class Pen extends Stationery{
    //继承文具类，实现展示方法
    //拥有颜色属性
    //提供无参和有参构造，提供get/set方法
    private String color;
    @Override
    void show() {
        System.out.println("名称： "+ getName()+" 数量： "+getMunBer()+" 价格： "+getPrice()+" 颜色： "+color);
    }
    //无参构造
    public Pen() {

    }
    //有参构造
    public Pen(String color) {
        this.color = color;
    }

    public Pen(String name, int munBer, String price, String color) {
        super(name, munBer, price);
        this.color = color;
    }
    //get set 方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
