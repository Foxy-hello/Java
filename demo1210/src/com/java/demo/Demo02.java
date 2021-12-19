package com.java.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入您的级别(A/B/C)");   //输入级别
        String one = hi.next();

        switch (one){               //switch进行判断
            case "A":{
                System.out.println("加薪500");        //加薪500
                break;
            }
            case "B":{
                System.out.println("加薪300");        //加薪300
                break;
            }
            case "C":{
                System.out.println("加薪100");        //加薪100
                break;
            }
            default:
                System.out.println("您输入的编号有误，请重新输入！");      //defult进行判断
        }
    }
}
