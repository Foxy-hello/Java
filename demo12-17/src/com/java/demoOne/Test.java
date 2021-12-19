package com.java.demoOne;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "梅赛德斯奔驰";
        c.color = "白色";
        c.numTyre = 3;
        RepairCar r = new RepairCar();
        int i = r.repairCar(3);
        c.run();
    }
}
