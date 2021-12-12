package com.student.demo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("请输入一个byte的值：");
        byte b = hello.nextByte();
        System.out.println("请输入一个short的值：");
        short a = hello.nextShort();
        System.out.println("请输入一个int的值：");
        int c = hello.nextInt();
        System.out.println("请输入一个long的值：");
        long d = hello.nextLong();
        System.out.println("请输入一个float的值：");
        float e = hello.nextFloat();
        System.out.println("请输入一个double的值：");
        double f = hello.nextDouble();
        System.out.println("请输入一个boolean的值：");
        boolean g = hello.nextBoolean();

        System.out.println("byte的值是："+b+"，占1个字节");
        System.out.println("shot的值是："+a+"，占2个字节");
        System.out.println("int的值是："+c+"，占4个字节");
        System.out.println("long的值是："+d+"，占8个字节");
        System.out.println("float的值是："+e+"，占4个字节");
        System.out.println("double的值是："+f+"，占8个字节");
        System.out.println("boolean的值是："+g+"，占1个字节");

    }
}
