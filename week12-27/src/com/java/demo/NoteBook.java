package com.java.demo;

public class NoteBook extends Stationery{
    //笔记本类(NoteBook)：
    //继承文具类，实现展示方法
    //拥有页数属性
    //提供无参和有参构造，提供get/set方法
    private int page;   //提供页数属性

    @Override
    void show() {
        System.out.println("名称： "+getName()+" 价格： "+getPrice()+" 数量： "+getNumber()+" 页数: "+page);
    }
    //提供无参和有参构造，提供get/set方法

    public NoteBook() {

    }

    public NoteBook(int page) {
        this.page = page;
    }

    public NoteBook(String name, double price, int number, int page) {
        super(name, price, number);
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
