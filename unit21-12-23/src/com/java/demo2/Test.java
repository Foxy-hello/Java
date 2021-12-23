package com.java.demo2;

public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        per.eat();
        per.sleep();
        per.work();
        Banker ban = new Banker();
        ban.work();
        ban.sleep();
        ban.invest();
    }
}
