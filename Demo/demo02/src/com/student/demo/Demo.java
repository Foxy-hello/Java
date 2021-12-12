package com.student.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("请输入三角形的底：");
        double botton = hello.nextDouble();
        System.out.println("请输入三角形的高：");
        double height = hello.nextDouble();
        double area = botton*height/2;
        System.out.println(area);
    }
}
