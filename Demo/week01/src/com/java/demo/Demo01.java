package com.java.demo;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        int i = 3;
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = hi.next();
        while (true) {
            System.out.println("请输入密码：");
            String password = hi.next();
            if ("ay123456".equals(password)){
                System.out.println("登录成功！");
                break;
            }else{
                i--;
                if (i==0){
                    System.out.println("该账号已经被锁定，请联系管理员");
                    break;
                }
                System.out.println("密码错误，请重新输入！还有"+i+"次机会");

            }


        }

    }
}
