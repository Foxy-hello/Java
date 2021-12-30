package com.java.demo;

public class Intangible extends Asset{
    //无形资产包含资产名称、资产说明、资产类别
    private String instruction;     //资产说明
    private String type;            //资产类别

    @Override
    public void show() {
        System.out.println("名称: "+getName()+" 资产说明： "+instruction+" 资产类别： "+type);
    }

    public Intangible(String name, String instruction, String type) {
        super(name);
        this.instruction = instruction;
        this.type = type;
    }

    public Intangible(String instruction, String type) {
        this.instruction = instruction;
        this.type = type;
    }

    public Intangible() {
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Intangible{" +
                "instruction='" + instruction + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
