package com.zh.dao;

import com.zh.bean.*;

import java.util.List;

public interface UserDao {
    User login(User user);

    List<Student> findAll();

    List<Echarts> getEchartsNum();

    List<Stu> getStu();

    List<Lou> getLou();

    List<Dormitory> getDormitory();

    int upd(Mi mi);
}
