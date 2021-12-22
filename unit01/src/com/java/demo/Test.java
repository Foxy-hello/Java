package com.java.demo;

public class Test {
    public static void main(String[] args) {
        //多态调用狗的方法
        Person per = new Dog();
        per.setName("旺财");
        per.setHealth("98");
        per.setLove("95");
        Dog dog = (Dog)per;
        dog.setType("哈士奇~");
        per.show();
        //多态调用企鹅的方法
        Person pen = new Penguin();
        pen.setName("滑稽企鹅");
        pen.setHealth("86");
        pen.setLove("92");
        //向下转型
        Penguin gun = (Penguin) pen;
        gun.setSex("公");
        pen.show();

    }
}
