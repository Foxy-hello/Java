package com.java.demo;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Method me = new Method();
        List<Emp> emp = me.FinalAll();
        for (Emp em : emp) {
            System.out.println(em);
        }
    }
}
