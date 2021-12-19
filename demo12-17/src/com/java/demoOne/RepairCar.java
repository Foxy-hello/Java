package com.java.demoOne;

public class RepairCar {
    //定义修理厂类变量
    String name;
    String add;
    //定义修车方法
    public int repairCar(int type){
        Car ca = new Car();
        ca.numTyre = 3;
        return ca.numTyre;
    }
}
