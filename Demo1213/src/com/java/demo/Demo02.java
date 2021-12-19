package com.java.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入打折前的消费金额：");
        double money = hi.nextDouble();
        if (money<100){
            System.out.println("您需要付款"+money+"元");
        }
        else if (money>=100&money<200){
            System.out.println("您需要付款"+money*0.95+"元");
        }
        else if (money>=200&money<500){
            System.out.println("您需要付款"+money*0.9+"元");
        }
        else if (money>=500&money<1000){
            System.out.println("您需要付款"+money*0.95+"元");
        }
        else if (money>=1000){
            System.out.println("您需要付款"+money*0.8+"元");
        }

    }
}
