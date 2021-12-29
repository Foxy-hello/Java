package com.bawei.demo;

/**
 * （6）正确编写操作接口，提供以下方法声明：
 * boolean add(Asset asset);增加资产，名称不能重复，成功true，失败false
 * boolean update(String name);根据资产名称修改资产信息，
 * void showAll();显示所有的资产信息
 */
public interface Operate {
    //显示所有的资产信息
    void showAll();

    //增加资产，名称不能重复，成功true，失败false
    boolean add(Asset asset);

    //根据资产名称修改资产信息，成功true，失败false
    boolean update(String name);
}
