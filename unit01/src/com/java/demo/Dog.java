package com.java.demo;

public class Dog extends Person {
    //(1)	Dog类：变量（昵称、健康值、亲密度、品种），输出宠物信息的方法
    private String type;    //定义品种
    //重写展示方法
    @Override
    public void show(){
        System.out.println("昵称： "+getName()+" 健康值： "+getHealth()+" 亲密度："+getLove()+" 品种： "+type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
