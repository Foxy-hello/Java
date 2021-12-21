package com.bawei.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int dividendNum = input.nextInt();
        System.out.print("请输入除数：");
        int divisorNum = input.nextInt();
        System.out.println("计算结果是："+(dividendNum/divisorNum));
        System.out.println("谢谢使用");

    }
}
