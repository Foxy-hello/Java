package com.zh.dao;

import com.zh.bean.Cuisine;
import com.zh.bean.Hotel;

import java.util.List;

public interface AllDao {
    //双表联查
    public List<Hotel> findAll();
    //模糊查询
    public List<Hotel> fuzzy(String name,String cid);
    //查询菜系
    public List<Cuisine> findByCui();
    //查询单个对象
    public Hotel findByHo(int id);
    //添加
    public int add(Hotel hotel);
    //修改
    public int update(Hotel hotel);
    //修改状态
    public int upState(int id,int state);
    //删除
    public int del(int id);
}
