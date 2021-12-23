package com.java.demo;

public class NoteBook extends Stationery {
    //继承文具类，实现展示方法
    //拥有页数属性
    //提供无参和有参构造，提供get/set方法
    private String page;    //页数属性
    @Override
    void show() {
        System.out.println("名称： "+ getName()+" 数量： "+getMunBer()+" 价格： "+getPrice()+" 页数： "+page);
    }
    //无参构造
    public NoteBook() {

    }
    //有参构造
    public NoteBook(String page) {
        this.page = page;
    }

    public NoteBook(String name, int munBer, String price, String page) {
        super(name, munBer, price);
        this.page = page;
    }
    //get set 方法
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
