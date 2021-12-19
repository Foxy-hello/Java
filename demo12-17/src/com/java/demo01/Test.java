package com.java.demo01;

public class Test {
    public static void main(String[] args) {
        Car ca = new Car();
        ca.coloa = "白色";
        ca.setLoad(5);
        System.out.println("车的颜色： "+ca.coloa);
        System.out.println("车的载客量： "+ca.getLoad());
    }
}
