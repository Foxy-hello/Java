package com.hello.demo;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.println("合格了吗？(y/n)");
        String answer = hi.next();

        while (!"y".equals(answer)){
            System.out.println("上午复习!");
            System.out.println("下午训练");
            System.out.println("合格了吗？(y/n)");
             answer = hi.next();
        }
        System.out.println("完成复习任务！");
    }
}
