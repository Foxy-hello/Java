package com.student.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        int num = hello.nextInt();
        System.out.println("这个值的结果计算后的值是："+(num*5/3+3.1415926));
    }
}
