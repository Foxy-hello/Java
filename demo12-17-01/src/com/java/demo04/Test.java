package com.java.demo04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        People pe = new People();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String name = sc.next();
        System.out.println("请输入密码：");
       for (int i=3;i > 0;i--){
           long pass = sc.nextLong();
           if (pe.name != "张三" && pe.password != 123456){
               System.out.println("密码错误，您还有"+i+"次机会");
           }else{
               System.out.println("登录成功");
           }
       }
    }
}
