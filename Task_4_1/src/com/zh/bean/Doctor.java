package com.zh.bean;

public class Doctor {
    private int id;
    private String name;
    private String gender;
    private String hobby;
    private String brith;
    private String depName;

    public Doctor(int id, String name, String gender, String hobby, String brith, String depName) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
        this.brith = brith;
        this.depName = depName;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                ", brith='" + brith + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
