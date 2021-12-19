package com.java.demo;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入班级成绩：");
        int []arr = new int[10];
        int sum = 0;
        for (int i = 0;i < 10;i++){
            arr[i] = hi.nextInt();
            sum += arr[i];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\n"+sum);
    }

}
