package com.java.demo;

public class ChildBook extends Book {
    //（4）儿童图书类和古籍图书类是图书类的子类，儿童图书类有“适合阶段”属性，
    // 值可以为：“幼儿”，“儿童”和“少年”。
    // 重写toString方法用于返回所有属性的信息（要用到super关键字）
    private String stage; //阶段
    //重写方法
    @Override
    public String toString() {
        return super.toString()+" 适合阶段 "+stage;   //super调用父类方法
    }
    //无参构造

    public ChildBook() {

    }
    //有参构造

    public ChildBook(String stage) {
        this.stage = stage;
    }

    public ChildBook(String id, String name, String author, String stage) {
        super(id, name, author);
        this.stage = stage;
    }
    //get set方法

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
