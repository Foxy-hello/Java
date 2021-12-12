package com.hello.demo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入环形外圆的半径(单位 cm)：");
        double one = hi.nextDouble();
        System.out.println("请输入环形内圆的半径(单位 cm)：");
        double two = hi.nextDouble();
        double area = 3.14*(one*one-two*two);
        System.out.println("环形的面积是："+area);
    }
}
