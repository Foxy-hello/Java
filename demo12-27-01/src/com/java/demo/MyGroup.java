package com.java.demo;

import java.util.Date;

public class MyGroup extends Group{
    //群组类包含组名、人数、创建时间、人数上限（默认100）、公告内容属性
    private final int People = 100; //用final修饰，不可更改
    private String Attributes;      //公告内容属性
    @Override
    void show() {
        System.out.println("群名称： "+getName()+" 人数： "+getNumber()+"/"+People+" 创建时间： "+getTime()+" 公告： "+Attributes);
    }
    //有参，无参，构造，get set方法，to String方法
    public MyGroup() {

    }

    public MyGroup(String attributes) {
        Attributes = attributes;
    }

    public MyGroup(String name, int number, String time, String attributes) {
        super(name, number, time);
        Attributes = attributes;
    }

    public String getAttributes() {
        return Attributes;
    }

    public void setAttributes(String attributes) {
        Attributes = attributes;
    }

    @Override
    public String toString() {
        return "MyGroup{" +
                "People=" + People +
                ", Attributes='" + Attributes + '\'' +
                '}';
    }
}
