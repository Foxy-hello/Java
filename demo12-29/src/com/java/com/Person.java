package com.java.com;

/**
 * 定义一个Person的抽象类，定义名字(name)和年龄(age)属性，
 * 并创建属性的setter/getter方法，定义一个打印属性的抽象方法printInfo。
 * 定义一个Person类的子类Student，定义属性学号（stuNun）（score）和成绩属性，
 * 并创建属性的setter/getter方法，并实现打印属性的方法printInfo。
 */
public abstract class Person {
    private String name;
    private int age;
    abstract void printInfo();
    //get set 方法

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
