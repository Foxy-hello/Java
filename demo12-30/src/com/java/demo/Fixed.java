package com.java.demo;

public class Fixed extends Asset{
    //固定资产包含资产名称、价格、购置日期、所属部门
    private double price;
    private String buyTime;
    private String Department;  //部门
    //重写方法
    @Override
    public void show() {
        System.out.println("名称： "+getName()+" 价格： "+getPrice()+"购置日期： "+getBuyTime()+" 所在部门： "+Department);
    }

    public Fixed(String name, double price, String buyTime, String department) {
        super(name);
        this.price = price;
        this.buyTime = buyTime;
        Department = department;
    }

    public Fixed(double price, String buyTime, String department) {
        this.price = price;
        this.buyTime = buyTime;
        Department = department;
    }

    public Fixed() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Fixed{" +
                "price=" + price +
                ", buyTime='" + buyTime + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
