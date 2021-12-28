package com.java.demo;

public class Teleplay extends Video {       //电视剧类，继承影片类
   //电视剧有集数
    private int number;     //电视剧集数

    @Override
    void show() {
        System.out.println("名称： "+super.getName());
        System.out.println("主演： "+super.getActor());
        System.out.println("集数： "+number);
    }

    public Teleplay() {

    }

    public Teleplay(int number) {
        this.number = number;
    }

    public Teleplay(String name, String actor, int number) {
        super(name, actor);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Teleplay{" +
                "number=" + number +
                '}';
    }
}
