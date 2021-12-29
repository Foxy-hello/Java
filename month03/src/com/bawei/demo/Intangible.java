package com.bawei.demo;

/**
 * 无形资产包含资产名称、资产说明、资产类别
 * 资产类别可选货币资金、金融资产、专利权、商标权等，也可自拟
 * （3）正确编写子类，并重写方法
 * （4）正确封装类、编写构造方法和get/set
 */
public class Intangible extends Asset{
    //资产说明、资产类别
    private String explain;
    private String type;

    //重写展示方法
    @Override
    public void show() {
        System.out.println("资产名称："+getName()+"，资产说明："+explain+"，资产类别："+type);
    }

    //get set toString 有参无参构造
    public Intangible() {
    }

    public Intangible(String name, String explain, String type) {
        super(name);
        this.explain = explain;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Intangible{" +
                "explain='" + explain + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
