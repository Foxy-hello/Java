package com.java.demo;

public class Penguin extends Person {
    //(4)	Penguin企鹅类：变量（昵称、健康值、亲密度、性别），输出宠物信息的方法
    private String sex;
    //重写方法
    @Override
    public void show(){
        System.out.println("昵称： "+getName()+" 健康值： "+getHea()+" 亲密度： "+getLove()+" 性别： "+sex);
    }

    public Penguin() {

    }

    public Penguin(String sex) {
        this.sex = sex;
    }

    public Penguin(String name, String hea, String love, String sex) {
        super(name, hea, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
