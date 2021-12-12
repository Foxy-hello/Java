package com.hello.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入梯形的上底长度：");
        double top = hi.nextDouble();
        System.out.println("请输入梯形的下底长度：");
        double botton = hi.nextDouble();
        System.out.println("请输入梯形的高度：");
        double height = hi.nextDouble();
        double area = (top+botton)*height/2;
        System.out.println("梯形的面积是："+area);

    }
}
