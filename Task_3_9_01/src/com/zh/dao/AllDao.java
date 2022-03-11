package com.zh.dao;

import com.zh.baan.Cls;
import com.zh.baan.Stu;

import java.util.List;

public interface AllDao {
    //查询所有
    public List<Stu> findAll();
    //添加的方法
    public int insert(Stu stu);
    //根据id查找对象
    public Stu findById(int id);
    //修改的方法
    public int update(Stu stu);
    //删除的方法
    public  int del(int id);
    //模糊查询的方法
    public List<Stu> fuzzy(String name,String stars,String end,String cid);
    //所有班级
    public List<Cls> findCls();
}
