package com.java.demo1;

public class Test {
    //赋值方法 1.直接赋值 2.set方法赋值 3.构造方法赋值
    //采用构造方法赋值
    public static void main(String[] args) {
        Dog dog = new Dog("1","小黄","棕色",3,"德牧");

        dog.eat();
        dog.show();
    }
}
