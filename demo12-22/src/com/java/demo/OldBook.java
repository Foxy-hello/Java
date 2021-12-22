package com.java.demo;

public class OldBook extends Book{
    //古籍图书类有“出版时间“字段。
    // 两个类都重写toString方法用于返回所有属性的信息
    private String time;
    //重写toString方法用于返回所有属性的信息
    @Override
    public String toString() {
        return super.toString()+" 出版时间 "+time;   //super调用父类方法
    }
    //无参构造

    public OldBook() {

    }
    //有参构造

    public OldBook(String time) {
        this.time = time;
    }

    public OldBook(String id, String name, String author, String time) {
        super(id, name, author);
        this.time = time;
    }
    //get set 方法

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
