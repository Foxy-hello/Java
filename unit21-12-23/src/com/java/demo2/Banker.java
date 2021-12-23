package com.java.demo2;

public class Banker extends Person{
    //银行家类（Banker），继承自人类，
    // 有自己的特有方法：投资（invest）重写睡觉，走路方法。
    public void work(){
        System.out.println("银行家在走路");
    }
    public void sleep(){
        System.out.println("银行家在睡觉");
    }
    public void invest(){
        System.out.println("银行家在理财");
    }
}
