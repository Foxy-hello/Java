package com.zh.bean;

public class Cuisine {
    private int cid;
    private String cName;
    private String area;

    @Override
    public String toString() {
        return "Cuisine{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public Cuisine() {
    }

    public Cuisine(int cid, String cName, String area) {
        this.cid = cid;
        this.cName = cName;
        this.area = area;
    }
}
