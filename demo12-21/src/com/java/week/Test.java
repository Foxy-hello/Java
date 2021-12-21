package com.java.week;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrank("奔驰");
        car.setName("华城");
        car.setPrice(500000);
        System.out.println(car.getBrank());
        System.out.println(car.getName());
        System.out.println(car.getPrice());


    }
}
