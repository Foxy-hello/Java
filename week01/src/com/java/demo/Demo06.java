package com.java.demo;

public class Demo06 {
    public static void main(String[] args) {
        //求出1-100之间奇数和，实现计算“1+3+5+7+…+99”的值.
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 != 0){
                 sum += i;
            }
        }
        System.out.println(sum);
    }
}
