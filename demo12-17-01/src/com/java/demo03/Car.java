package com.java.demo03;

public class Car {
    private String blank;
    private String color;
    private int load;

    public void show(){
        if (load <= 0){
            System.out.println("人数错误");
        }else{
            System.out.println("一辆"+blank+"正在启动");
            System.out.println("这是一个"+color+"的"+blank+"车");
            System.out.println("这个车里面有"+load+"人");
        }
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
