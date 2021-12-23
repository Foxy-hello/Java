package com.java.demo2;

public class Person {
    //定义一个人类（Person），有吃饭，睡觉，走路3种方法，其中吃饭方法定义为final方法
    final public void eat (){
        System.out.println("一个人在吃饭");
    }
    public void work(){
        System.out.println("一个人在走路");
    }
    public void sleep(){
        System.out.println("一个人在睡觉");
    }

    public Person() {

    }

}
