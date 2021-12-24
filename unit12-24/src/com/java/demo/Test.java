package com.java.demo;

public class Test {
    public static void main(String[] args) {
        //	测试类中，创建一个对象数组，长度为2，保存一个圆形对象一个正方形对象
        Road road = new Road();
        Square squ = new Square();
        Area[] arr = new Area[]{road,squ};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Road){
                arr[i].area();
                arr[i].length();
            }
            if (arr[i] instanceof Square){
                arr[i].area();
                arr[i].length();
            }
        }


    }
}
