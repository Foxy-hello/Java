package com.zh.pojo;

public class StuCourse {
    private Integer scId;
    private Integer sId;
    private Integer cId;

    public StuCourse(Integer scId, Integer sId, Integer cId) {
        this.scId = scId;
        this.sId = sId;
        this.cId = cId;
    }

    public StuCourse() {
    }

    @Override
    public String toString() {
        return "StuCourse{" +
                "scId=" + scId +
                ", sId=" + sId +
                ", cId=" + cId +
                '}';
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
