package com.java.demo;

public interface Operation {

    boolean add(Asset asset);   //增加资产，名称不能重复，成功true，失败false

    boolean update(String name); //根据资产名称修改资产信息，

    void showAll(); //显示所有的资产信息

}
