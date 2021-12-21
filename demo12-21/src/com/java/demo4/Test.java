package com.java.demo4;

public class Test {
    public static void main(String[] args) {
        Person pe = new Man();
        pe.walk();
        Man an = (Man) pe;
        an.somking();
    }
}
