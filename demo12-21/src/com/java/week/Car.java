package com.java.week;

public class Car {
    private String name;
    private int price;
    private String brank;

    public Car(String name, int price, String brank) {
        this.name = name;
        this.price = price;
        this.brank = brank;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrank() {
        return brank;
    }

    public void setBrank(String brank) {
        this.brank = brank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brank='" + brank + '\'' +
                '}';
    }
}
