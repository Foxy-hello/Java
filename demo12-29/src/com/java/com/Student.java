package com.java.com;

import javax.naming.Name;

public class Student extends Person{
    //定义属性学号（stuNun）（score）和成绩属性
    private int stuNum;
    private double score;
    //实现父类方法

    @Override
    void printInfo() {
        System.out.println("姓名： "+ getName()+" 年龄： "+getAge()+" 学号： "+stuNum+" 成绩： "+score);
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age, int stuNum, double score) {
        super(name, age);
        this.stuNum = stuNum;
        this.score = score;
    }
}
