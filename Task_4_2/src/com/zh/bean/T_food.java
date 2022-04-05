package com.zh.bean;

public class T_food {
    private int fid;
    private String fName;
    private double price;
    private String time;
    private String content;
    private int tid ;
    private String tName;

    public T_food(int fid, String fName, double price, String time, String content, int tid, String tName) {
        this.fid = fid;
        this.fName = fName;
        this.price = price;
        this.time = time;
        this.content = content;
        this.tid = tid;
        this.tName = tName;
    }

    public T_food() {
    }

    @Override
    public String toString() {
        return "T_food{" +
                "fid=" + fid +
                ", fName='" + fName + '\'' +
                ", price=" + price +
                ", time='" + time + '\'' +
                ", content='" + content + '\'' +
                ", tid=" + tid +
                ", tName='" + tName + '\'' +
                '}';
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
