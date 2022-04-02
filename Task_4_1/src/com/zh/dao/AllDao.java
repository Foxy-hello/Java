package com.zh.dao;

import com.zh.bean.Doctor;
import com.zh.bean.Game;
import com.zh.bean.User;

import java.util.List;

public interface AllDao {
    //登录功能
    public User login(String name, String pwd);
    //验证功能
    public int verify(String name);
    //注册功能
    public int addUser(User user);
    //查询所有医生信息
    public List<Doctor> findAll();
    //批量删除
    public int delAll(String id);
    //添加医生信息
    public int addDoc(Doctor doc);
    //查找医生个人信息
    public Doctor byId(int id);
    //修改医生信息
    public int update(Doctor doc);
    //删除医生信息
    public int del(int id);
    //查看用户信息
    public List<Game>findGame();
}
