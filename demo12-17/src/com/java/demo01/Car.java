package com.java.demo01;

public class Car {
    String coloa;
    private int load;

    public void setLoad(int load){
        if (load<0){
            System.out.println("数据错误！");
        }else{
            this.load = load;
        }
    }
    public int getLoad(){
        return load;
    }
}
