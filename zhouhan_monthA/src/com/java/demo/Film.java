package com.java.demo;

public class Film extends Video{    //电影有时间属性
    private int time;   //时长属性
    //重写方法
    @Override
    void show() {
        System.out.println("名称： "+super.getName());
        System.out.println("主演： "+super.getActor());
        System.out.println("时长： "+time);
    }
     /*
    提供有参，无参，get set 方法，to String方法
     */

    public Film() {
    }

    public Film(int time) {
        this.time = time;
    }

    public Film(String name, String actor, int time) {
        super(name, actor);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Film{" +
                "time=" + time +
                '}';
    }
}
