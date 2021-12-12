package com.hello.demo;

import java.util.Scanner;

public class Fordemo {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = hi.next();
        int sum=0;
        for (int i = 0;i<5;i++){
            System.out.println("请输入第"+i+"门的成绩");
            sum += hi.nextInt();
        }
        System.out.println("学生的总分是："+sum);
        System.out.println("学生的平均分是："+sum/5);
    }
}
