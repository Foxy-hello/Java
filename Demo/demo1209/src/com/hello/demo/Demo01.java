package com.hello.demo;

import java.util.Scanner;               //导入输入的包

public class Demo01 {
    public static void main(String[] args) {                //主方法，进入函数的方式
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入三角形的底：");               //输入三角形的底
        int botton = hi.nextInt();
        System.out.println("请输入三角形的高：");                //输入三角形的高
        int height = hi.nextInt();
        System.out.println("三角形的面积是："+(botton*height/2));    //输出三角形的面积
    }
}
