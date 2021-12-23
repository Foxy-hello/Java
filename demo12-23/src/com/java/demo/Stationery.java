package com.java.demo;

public  abstract class Stationery {
    //抽象类；
    //拥有文具名称、价格和数量属性
    //提供无参和有参构造方法；提供get/set方法
    //提供抽象方法，用于展示成员变量值，无参无返回值
    private String name;    //文具名称
    private int munBer;  //文具数量
    private String price;   //文具价格
    //抽象方法，展示成员变量
    abstract void show();
    //无参方法
    public Stationery() {

    }
    //有参方法
    public Stationery(String name, int munBer, String price) {
        this.name = name;
        this.munBer = munBer;
        this.price = price;
    }
    //get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMunBer() {
        return munBer;
    }

    public void setMunBer(int munBer) {
        this.munBer = munBer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
