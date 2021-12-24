package com.java.demo;

public class Road implements Area {
    //（2）	定义一个圆形类，实现该接口，并重写接口中的两个方法
    //（4）	要求圆形类中添加一个常量 PI=3.14
    final double p = 3.14;
    //定义圆的半径为r，周长为l
    double r = 5;

    @Override
    public void area() {
        double v = p * r * r;
        System.out.println("圆的面积是： "+v);
    }

    @Override
    public void length() {
        double v = p * 2 * r;
        System.out.println("圆的周长是： "+v);
    }

}
