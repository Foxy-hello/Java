package com.java.demo;

public class Dog extends Person{
    //(3)	Dog类：变量（昵称、健康值、亲密度、品种），输出宠物信息的方法
    private String type;
    //重写方法
    @Override
    public void show(){
        System.out.println("昵称： "+getName()+" 健康值： "+getHea()+" 亲密度： "+getLove()+" 品种： "+type);
    }

    public void jump(){
        System.out.println("他在游泳");
    }

    public Dog() {

    }

    public Dog(String type) {
        this.type = type;
    }

    public Dog(String name, String hea, String love, String type) {
        super(name, hea, love);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
