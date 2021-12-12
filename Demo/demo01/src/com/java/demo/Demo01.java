package com.java.demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的底：");
        double di = sc.nextDouble();

        System.out.println("请输入三角形的高：");
        double high = sc.nextDouble();

        double mj=di*high/2;
        System.out.println("三角形的面积是："+mj);
    }
}
