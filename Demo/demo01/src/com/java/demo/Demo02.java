package com.java.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int mun = sc.nextInt();
        System.out.println("经过计算的值是："+mun*5/3+3.1415926);
        int mun1 = (int)(mun*5/3+3.1415926);
        System.out.println("转换int后的值是：" + mun1);
    }
}
