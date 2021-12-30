package com.java.demo;

/**
 * 资产（Asset）分为固定资产（Fixed）和无形资产（Intangible）两种
 * 固定资产包含资产名称、价格、购置日期、所属部门
 * 无形资产包含资产名称、资产说明、资产类别
 * （1）正确定义父类，抽象类
 * （2）父类正确声明抽象方法，用于展示成员变量值
 */
public abstract class Asset {
    //定义资产名称
    private String name;
    //展示方法
    public abstract void show();
    //提供get set toString方法，有参 无参方法

    public Asset(String name) {
        this.name = name;
    }

    public Asset() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                '}';
    }
}
