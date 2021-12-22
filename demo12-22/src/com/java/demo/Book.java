package com.java.demo;

public class Book {
    //（3）图书类有图书编号，书名，作者3个属性，
    // 重写toString方法用于返回图书所有属性的信息，
    // 定义带上述3个属性的构造方法。
    private String id;
    private String name;
    private String author;
    //to string 方法

    @Override
    public String toString() {
        return "编号:" + id + '\'' + ", 书名:" + name + '\'' + ", 作者:" + author;
    }
    //无参构造方法

    public Book() {

    }
    //有参构造方法

    public Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    //get set 方法

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
