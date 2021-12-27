package com.java.demo;

import java.util.Date;

public abstract class Group {
    //抽取组名、人数、创建时间
    private String name;    //组名
    private int number;     //人数
    private String time;      //创建时间
    //展示方法
    abstract void show();
    //有参，无参，构造，get set方法，to String方法

    public Group() {
    }

    public Group(String name, int number, String time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", time=" + time +
                '}';
    }
}
