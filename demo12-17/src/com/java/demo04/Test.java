package com.java.demo04;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("靓仔");
        stu.setAdd("广东靓仔村");
        stu.setAge(23);

        System.out.println(stu.getName());
        System.out.println(stu.getAdd());
        System.out.println(stu.getAge());
    }
}
