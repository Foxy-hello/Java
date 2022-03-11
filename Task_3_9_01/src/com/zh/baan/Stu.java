package com.zh.baan;

public class Stu {
    private int sid;
    private String sName;
    private String sex;
    private int age;
    private String happy;
    private String time;
    private int cid;
    private String cName;

    public Stu(int sid, String sName, String sex, int age, String happy, String time, int cid, String cName) {
        this.sid = sid;
        this.sName = sName;
        this.sex = sex;
        this.age = age;
        this.happy = happy;
        this.time = time;
        this.cid = cid;
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", happy='" + happy + '\'' +
                ", time='" + time + '\'' +
                ", cid=" + cid +
                ", cName='" + cName + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public Stu() {
    }
}
