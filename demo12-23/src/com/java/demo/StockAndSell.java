package com.java.demo;

public interface StockAndSell {
    //能够进货和售出的接口（StockAndSell）
    //sell( )：无参无返回值，能够售出的
    //stock( )：无参无返回值，能够进货的

    //售出方法
    public abstract void sell();
    //进货方法
    void stock();
}
