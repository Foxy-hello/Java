package com.zh.pojo;

public class Stu {

    private Integer sId;
    private String sName;
    private String sSex;
    private String sBirth;
    private Double sScore;
    private Integer count;
    private String courseName;
    private String cIds;

    public Stu(Integer sId, String sName, String sSex, String sBirth, Double sScore) {
        this.sId = sId;
        this.sName = sName;
        this.sSex = sSex;
        this.sBirth = sBirth;
        this.sScore = sScore;
    }

    public Stu(Integer sId, String sName, String sSex, String sBirth, Double sScore, Integer count, String courseName) {
        this.sId = sId;
        this.sName = sName;
        this.sSex = sSex;
        this.sBirth = sBirth;
        this.sScore = sScore;
        this.count = count;
        this.courseName = courseName;
    }

    public Stu(Integer sId, String sName, String sSex, String sBirth, Double sScore, Integer count, String courseName, String cIds) {
        this.sId = sId;
        this.sName = sName;
        this.sSex = sSex;
        this.sBirth = sBirth;
        this.sScore = sScore;
        this.count = count;
        this.courseName = courseName;
        this.cIds = cIds;
    }

    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sBirth='" + sBirth + '\'' +
                ", sScore=" + sScore +
                '}';
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcIds() {
        return cIds;
    }

    public void setcIds(String cIds) {
        this.cIds = cIds;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsBirth() {
        return sBirth;
    }

    public void setsBirth(String sBirth) {
        this.sBirth = sBirth;
    }

    public Double getsScore() {
        return sScore;
    }

    public void setsScore(Double sScore) {
        this.sScore = sScore;
    }
}
