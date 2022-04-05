package com.zh.dao;

import com.zh.bean.T_food;
import com.zh.bean.T_type;

import java.util.List;

public interface AllDao {
    //双表联查
    public List<T_food>findFoods();
    //添加
    public int addFood(T_food food);
    //查询单个菜品
    public T_food findById(int id);
    //修改菜品
    public int update(T_food food);
    //模糊查询
    public List<T_food>fuzzy(String name,String start,String end);
    //批量删除
    public int delAll(String id);
    //单个删除
    public int del(int id);
    //下拉框
    public List<T_type>findType();
}
