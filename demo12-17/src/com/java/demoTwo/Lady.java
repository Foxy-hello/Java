package com.java.demoTwo;

public class Lady {
    //定义变量
    String name = "丽萨";
    //定义行为
    public void feed(){
        System.out.println(name+"在喂");
        Dog dog = new Dog();
        dog.show();

    }
}
