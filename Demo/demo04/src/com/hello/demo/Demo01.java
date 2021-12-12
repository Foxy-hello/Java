package com.hello.demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = hi.next();
        int length = name.length();
        if (name.length()<3) {
            System.out.println("用户长度至少为3位");

        }
        else{
            System.out.println("用户长度为："+name.length());
            System.out.println("请输入密码：");
            int password = hi.nextInt();
            if (password!=123){
                System.out.println("您输入的密码错误！");
            }
            else{
                System.out.println("登录成功！");
            }
        }

    }
}
