package com.zh.baan;

public class Cls {
    private int cid;
    private String cName;

    @Override
    public String toString() {
        return "Cls{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
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

    public Cls() {
    }

    public Cls(int cid, String cName) {
        this.cid = cid;
        this.cName = cName;
    }
}
