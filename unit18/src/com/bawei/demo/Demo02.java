package com.bawei.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {

        //运行时(非检查型)异常，不要求程序必须做出处理
        //编译是通过的，不需要立即处理
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("qwe-MM-dd HH:mm:ss");
        String format = sdf.format(date); //Date类型转换为String
        System.out.println(format);



    }
}
