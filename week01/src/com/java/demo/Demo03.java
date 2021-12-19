package com.java.demo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("1.计算员工工资  2.计算领导工资");
        System.out.println("请选择：");
        int unit = hi.nextInt();

        switch (unit){
            case 1:{
                System.out.println("请输入员工工资：");
                double money = hi.nextDouble();
                System.out.println("员工的工资是："+(money *= 1.2));
                break;
            }
            case 2:{
                System.out.println("请输入领导的工资：");
                double money = hi.nextDouble();
                System.out.println("员工的工资是："+(money *= 1.4));
            }
        }
    }
}
