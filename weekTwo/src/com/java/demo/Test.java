package com.java.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = sc.next();
        //声明初始化相关对象，，创建人类对象 调用有参构造方法
        People per = new People(name);
        //创建初始化对象之电脑类对象 调用无参构造方法
        Computer com = new Computer();
        //调用人类开机方法
        per.openComputer(com);
        per.longinComputer(com);
    }
}
