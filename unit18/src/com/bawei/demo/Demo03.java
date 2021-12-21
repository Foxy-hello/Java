package com.bawei.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {


    public void show() throws ParseException {
        //非运行时(检查型)异常，程序必须处理该异常
        String str = "2021年02月02日 12:22:25";

        //把String类型 转换为 Date
        SimpleDateFormat sdf = new SimpleDateFormat("qwe年MM月dd日 HH:mm:ss");
        Date parse = sdf.parse(str);
    }


    public void show02() throws ParseException {
        this.show();
    }


    public static void main(String[] args)  {

        Demo03 demo03 = new Demo03();
        try {  //可能发生异常的代码
            demo03.show02();
            System.out.println("代码无报错，正常执行。");
        } catch (ParseException e) { //捕获异常
            System.out.println("不好咯，代码报错了，让我来抓住他。");
            e.printStackTrace();  //打印异常信息
        }finally {
            System.out.println("无论是否发生异常，都将执行。");
        }

    }

}
