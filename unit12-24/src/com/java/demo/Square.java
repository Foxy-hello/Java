package com.java.demo;

public class Square implements Area{
    //	定义一个正方形类，实现该接口，并重写接口中的两个方法
    //定义正方形的边长为wei
    double wei = 4;
    @Override
    public void area() {
        double v = wei * wei;
        System.out.println("正方形的面积是： "+v);
    }

    @Override
    public void length() {
        double v = wei * 4;
        System.out.println("正方形的面积是："+v);
    }
}
