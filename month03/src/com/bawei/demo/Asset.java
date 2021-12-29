package com.bawei.demo;

/**
 * 资产（Asset）分为固定资产（Fixed）和无形资产（Intangible）两种
 * 固定资产包含资产名称、价格、购置日期、所属部门
 * 无形资产包含资产名称、资产说明、资产类别
 * 资产类别可选货币资金、金融资产、专利权、商标权等，也可自拟
 * （1）正确定义父类，抽象类
 *     正确抽取共同属性，个数、类型、访问修饰符合理，并提供get/set
 * （2）父类正确声明抽象方法，用于展示成员变量值
 * （4）正确封装类、编写构造方法和get/set
 */
public abstract class Asset {
    //资产名称
    private String name;

    //正确声明抽象方法，用于展示成员变量值
    public abstract void show();

    //get set toString 有参无参构造
    public Asset() {
    }

    @Override
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Asset(String name) {
        this.name = name;
    }
}
