package com.zh.bean;

public class T_type {
    private int tid;
    private String tName;

    public T_type(int tid, String tName) {
        this.tid = tid;
        this.tName = tName;
    }

    public T_type() {
    }

    @Override
    public String toString() {
        return "T_type{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                '}';
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
