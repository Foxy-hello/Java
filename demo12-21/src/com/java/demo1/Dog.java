package com.java.demo1;

public class Dog extends Animal{
    //定义成员品种
    private String type;
    //重写父类的show方法和eat方法
    public void eat(){
        System.out.println("正在吃饭");
    }
    @Override
    public void show(){
        System.out.println("序号： "+super.getId()+" 姓名： "+getName()+" 颜色： "+super.getColor()+" 年纪： "+super.getAge());
    }
    //定义五个带参构造方法

    public Dog(String id, String name, String color, int age, String type) {
        super(id, name, color, age);
        this.type = type;
    }
}
