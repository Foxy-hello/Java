package com.java.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
            int num = hi.nextInt();
            if (num >= 100 & num <= 999 ) {
                int unit = num % 10;
                int ten = num / 10 % 10;
                int one = num / 100 % 10;
                if ((unit*unit*unit)+(ten*ten*ten)+(one*one*one) == num){
                    System.out.println("这个数是水仙花数~");
                }else {
                    System.out.println("这个数不是水仙花数！");
                }
            }else {
                System.out.println("这个数不是三位数，请重新输入");
            }
    }
}
