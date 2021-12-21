package com.bawei.demo02;

import java.text.SimpleDateFormat;

public class Demo {
    public static void main(String[] args) {

        //ArithmeticException
        //当出现异常的运算条件时抛出的异常
        int num1 = 10;
        int num2 = 0;
//        int result = num1 / num2;


        //ArrayIndexOutOfBoundsException
        //当用非法索引访问数组时抛出的异常
//        int[] nums = new int[6];  //6 ：长度
//        nums[6] = 12;  // 6 ： 下标  （从0开始）


        //NumberFormatException
        //当把不符合数字格式的字符串转换成数字时发生的异常
//        int i = Integer.parseInt("abc");
//        System.out.println(i);

        //IllegalArgumentException
        //当调用方法时给予非法或不恰当的参数时发生的异常
//        SimpleDateFormat sdf = new SimpleDateFormat("qwe");

        //ClassCastException
        //当进行向下转型时，对象不是子类的实例时发生的异常

    }

}
