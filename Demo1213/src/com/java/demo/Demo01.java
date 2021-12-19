package com.java.demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int one = hi.nextInt();
        System.out.println("请输入第二个数：");
        int two = hi.nextInt();
        System.out.println("请输入需要进行的操作");
        String flag = hi.next();
        switch (flag){
            case "加":{
                System.out.println("结果是"+(one+two));
                break;
            }
            case "减":{
                System.out.println("结果是"+(one-two));
                break;
            }
            case "乘":{
                System.out.println("结果是"+(one*two));
                break;
            }
            case "除":{
                System.out.println("结果是"+(one/two));
                break;
            }
            case "余":{
                System.out.println("结果是"+(one%two));
                break;
            }
            default:
                System.out.println("输入错误。请重新输入！");
        }
    }
}
