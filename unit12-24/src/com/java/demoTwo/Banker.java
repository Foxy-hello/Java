package com.java.demoTwo;

public class Banker extends Person{
    //（2）	再定义一个银行家类（Banker），继承自人类，有自己的特有方法：投资（invest）。
    //重写睡觉，走路方法
    public void invest(){
        System.out.println("他在投资");
    }
    @Override
    public void sleep(){
        System.out.println("他在睡觉");
    }
    @Override
    public void run(){
        System.out.println("他在走路！");
    }
}
