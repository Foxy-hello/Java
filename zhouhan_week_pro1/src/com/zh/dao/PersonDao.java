package com.zh.dao;

import com.zh.bean.Person;

import java.util.List;

public interface PersonDao {
    //查询方法
    public List<Person> findAll();
    //添加
    public int insert(Person per);
    //删除的方法
    public int del(int id);
}
