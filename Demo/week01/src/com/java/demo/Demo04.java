package com.java.demo;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        while (true){
            System.out.println("1.数据类型转换  2.谁是第一名  3.输出1-某个数之间能被三整除的数  4.百位数拆解  5.能否组成三角形  6.退出");
            System.out.println("请选择：");
            int unit = hi.nextInt();
            switch (unit){
                case 1:{
                    //	控制台输入一个65.0到123.0之间的小数，不在此范围给出提示重新输入
                    System.out.println("请输入一个65.0-132.0之间的小数：");
                    double mun = hi.nextDouble();
                    if (mun < 65.0|mun > 132.0){
                        System.out.println("输入的数字不符合要求，请重新输入！");
                    }else{
                        int munOne = (int)mun;
                        char number = (char)munOne;
                        System.out.println("这个数字对应的字母是："+number);
                    }
                    break;
                }
                case 2:{
                    int max=0;int s=0;
                    for (int i = 1;i<=3;i++){
                        System.out.println("请输入第"+i+"名学生的成绩：");
                        int sum = hi.nextInt();

                        if (i == 1){
                             max = sum;
                             s=i;
                        }
                        if (max<sum){
                            max = sum;
                         s=i;
                        }
                    }
                    System.out.println("第"+s+"名"+max);
                    break;
                }
                case 3:{
                    int count = 0;
                    System.out.println("请输入一个大于1的正整数：");
                    int munber = hi.nextInt();
                    for (int i = 2;i<=munber;i++){
                        if (i%3 == 0){
                            System.out.print( i +"\t");
                            count++;
                            if(count % 3 == 0){
                                System.out.println();
                            }
                        }
                    }
                    break;
                }

            }
        }
    }
}
