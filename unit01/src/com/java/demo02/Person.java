package com.java.demo02;

public class Person {
    //定义一个父类Person类。有姓名、编号、类型三个属性。
    // 定义一个展示自己信息	的方法。定义一个带参构造方法，为属性赋值
    private String name;
    private String id;
    private String type;
    //展示方法
    public void show(){
        System.out.println("编号: "+id+" 姓名： "+name+" 类型： "+type);
    }
    public void eat(){
        System.out.println("在吃饭");
    }

    public Person() {

    }

    public Person(String name, String id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
