package com.java.demo;

/**
 * （1）影片（Video）包含电视剧（Teleplay）和电影（Film）
 * （2）影片类是,抽象类，包含名称和主演，提供抽象方法show()用于展示成员变量值
 */
public abstract class Video {
    private String name;    //名称
    private String actor;   //主演
    //提供抽象方法
    abstract void show();
    /*
    提供有参，无参，get set 方法，to String方法
     */
    public Video() {
    }

    public Video(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}
