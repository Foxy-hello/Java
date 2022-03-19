package com.zh.bean;

public class Hotel {
    private int id ;
    private int cid;
    private String name;
    private String description;             //饭店简介
    private String time;
    private int state;
    private String cName;
    private String area;

    public Hotel(int id, int cid, String name, String description, String time, int state, String cName, String area) {
        this.id = id;
        this.cid = cid;
        this.name = name;
        this.description = description;
        this.time = time;
        this.state = state;
        this.cName = cName;
        this.area = area;
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", state=" + state +
                ", cName='" + cName + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
