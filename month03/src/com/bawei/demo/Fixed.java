package com.bawei.demo;

/**
 * 固定资产包含资产名称、价格、购置日期、所属部门
 * （3）正确编写子类，并重写方法
 * （4）正确封装类、编写构造方法和get/set
 */
public class Fixed extends Asset{
    //资产价格、购置日期、所属部门
    private double price;
    private String date;
    private String department;

    //重写展示方法
    @Override
    public void show() {
        System.out.println("资产名称："+getName()+"，资产价格："+price+"，购置日期："+date+"，所属部门："+department);
    }

    //get set toString 有参无参构造
    public Fixed() {
    }

    public Fixed(String name, double price, String date, String department) {
        super(name);
        this.price = price;
        this.date = date;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Fixed{" +
                "price=" + price +
                ", date='" + date + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
