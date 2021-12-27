package com.java.demo;

public abstract class Stationery {
    //文具类（Stationery）：
    //抽象类；
    //拥有文具名称、价格和数量属性
    //提供无参和有参构造方法；提供get/set方法
    //提供抽象方法，用于展示成员变量值，无参无返回值
    private String name;    //名称
    private double price;   //价格
    private int number;     //数量
    //提供展示方法
    abstract void show();
    //提供无参构造
    public Stationery() {

    }
    //提供有参构造
    public Stationery(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
    //提供get set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //提供to string方法

    @Override
    public String toString() {
        return "Stationery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
