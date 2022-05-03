package com.zh.pojo;

public class Course {
    private Integer cId;
    private String cName;

    public Course(Integer cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
