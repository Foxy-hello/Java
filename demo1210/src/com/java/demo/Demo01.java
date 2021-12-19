package com.java.demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);         //输入格式
        System.out.println("请输入用户名：");             //输入用户名
        String name = hi.next();
        System.out.println("请输入密码：");               //输入密码
        int password = hi.nextInt();
        if (password!=123){                             //判断密码是否正确
            System.out.println("密码错误，请重新输入！");     // 密码错误
        }else{
            System.out.println("登录成功");                  //密码正确
        }
    }
}
