package com.zh.dao;

import com.zh.bean.Admin;

import java.util.List;

public interface AdminDao {
    public Admin login(Admin admin);
    public List<Admin> findAll();
    public int add(Admin admin);
    public int del(int id);
    public int update(Admin admin);
    public Admin findById(int id);
    public Admin findID(int id);
}
