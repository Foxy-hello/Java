package com.java.demoTwo;

public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        Banker ban = new Banker();
        per.eat();
        per.run();
        per.sleep();
        ban.invest();
        ban.sleep();
        ban.run();
    }
}
