package com.java.com;

/**
 *  (5)	创建子类的实例，给子类设置学号、姓名、年龄、成绩的属性值，调用覆写的抽象方法，打印属性信息。（20）
 */
public class test {
    public static void main(String[] args) {
        Student stu = new Student("小芳",12,1001,86.5);
        stu.printInfo();

    }
}
