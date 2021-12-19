package com.java.demoOne;

public class Car {
    //定义汽车类变量
    String name;    //汽车名称
    String color;   //汽车颜色
    int numTyre;    //汽车车轮个数
    //定义run方法
    public void run(){
        System.out.println(color+name+numTyre+"个轮子，跑起来了");
    }
}
