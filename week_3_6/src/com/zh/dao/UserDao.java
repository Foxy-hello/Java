package com.zh.dao;

import com.zh.bean.Admin;
import com.zh.bean.User;

import java.util.List;

public interface UserDao {
    //查询所有的方法
    public List<User> findAll();
    //查询单个的方法
    public User findById(int id);
    //删除的方法
    public int del(int id);
    //添加的方法
    public int insert(User user);
    //修改的方法
    public int update(int id);
    //登录的方法
    public Admin login(Admin admin);
}
