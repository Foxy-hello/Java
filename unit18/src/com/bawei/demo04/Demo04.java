package com.bawei.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) throws ParseException,ArithmeticException,IllegalArgumentException, NullPointerException{

        int a = 10;
        int b = 0;
        System.out.println(a/b);   //算数异常  ArithmeticException

        SimpleDateFormat qwe = new SimpleDateFormat("qwe");  //参数异常  IllegalArgumentException

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date parse = sdf.parse("20222"); //参数异常   IllegalArgumentException

        Demo04 demo04 = null;
        demo04.show();  //空指针异常  NullPointerException


    }

    void show(){};

}
