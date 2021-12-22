package com.java.demo;

public class Penguin extends Person {
    //Penguin企鹅类：变量（昵称、健康值、亲密度、性别），输出宠物信息的方法。
    private String sex;
    //重写
    @Override
    public void show(){
        System.out.println("昵称： "+getName()+" 健康值： "+getHealth()+" 亲密度："+getLove()+"性别： "+sex);
    }
    //get set方法


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
