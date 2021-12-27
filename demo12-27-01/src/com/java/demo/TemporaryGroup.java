package com.java.demo;

import java.util.Date;

public class TemporaryGroup extends Group{
    //临时组类包含组名、人数、创建时间、最后发言时间属性
    private String lastTime;  //最后发言时间
    @Override
    void show() {

        System.out.println("群名称： "+getName()+" 人数： "+getNumber()+" 创建时间： "+getTime()+" 最后发言时间： "+lastTime);
    }
    //有参，无参，构造，get set方法，to String方法

    public TemporaryGroup() {

    }

    public TemporaryGroup(String lastTime) {
        this.lastTime = lastTime;
    }

    public TemporaryGroup(String name, int number, String time, String lastTime) {
        super(name, number, time);
        this.lastTime = lastTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "TemporaryGroup{" +
                "lastTime=" + lastTime +
                '}';
    }
}
