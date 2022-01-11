package com.java.demo01;

import java.util.Objects;

public class Flower implements Comparable<Flower> {
    private String name;
    private double score;

    public Flower(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Flower() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.score, score) == 0 && name.equals(flower.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "花名: "+name+" 价格: "+score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Flower o) {
        return (int)score - (int) o.score;
    }
}
