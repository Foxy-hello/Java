package com.hello.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {                              //主方法
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入一个整数：");                              //输入一个整数
        int num = hi.nextInt();
        double sun = num*5/3+3.1415926;                                   //   计算变量的值
        System.out.println("num*5/3+3.1415926的结果是："+sun);
        int one = (int)sun;                                               //   转换成int类型
        System.out.println("转换为int类型输出结果是："+one);                  //   输出结果！
    }
}
