package com.zh.service;

import com.zh.bean.*;

import java.util.List;

public interface UserService {
    User login(User user);

    List<Student> findAll();

    List<Echarts> getEchartsNum();

    List<Stu> getStu();

    List<Lou> getLou();

    List<Dormitory> getDormitory();

    int upd(Mi mi);
}
