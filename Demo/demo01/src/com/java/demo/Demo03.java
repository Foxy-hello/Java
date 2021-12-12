package com.java.demo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("请输入一个byte值：");
        byte a = hello.nextByte();
        System.out.println("请输入一个short值：");
        short s = hello.nextShort();
        System.out.println("请输入一个int值：");
        int i = hello.nextInt();
        System.out.println("请输入一个long值：");
        long L = hello.nextLong();
        System.out.println("请输入一个float值：");
        float f = hello.nextFloat();
        System.out.println("请输入一个double值：");
        double d = hello.nextDouble();
        System.out.println("请输入一个Boolean值：");
        boolean b = hello.nextBoolean();

        System.out.println("byte的值是："+a+"，占1个字节");
        System.out.println("short的值是："+s+"，占2个字节");
        System.out.println("int的值是："+i+"，占4个字节");
        System.out.println("long的值是："+L+"，占8个字节");
        System.out.println("float的值是："+f+"，占4个字节");
        System.out.println("double的值是："+d+"，占8个字节");
        System.out.println("boolean的值是："+b+"，占1个字节");
    }
}
