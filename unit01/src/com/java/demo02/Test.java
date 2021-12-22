package com.java.demo02;

public class Test {
    public static void main(String[] args) {
        Work wo = new Work();
        wo.setId("1");
        wo.setName("张三");
        wo.setType("教师");
        wo.show();
        wo.eat();
        Work wo2 = new Work();
        wo2.setId("2");
        wo2.setName("李四");
        wo2.setType("医生");
        wo2.show();
        wo2.eat();


    }
}
