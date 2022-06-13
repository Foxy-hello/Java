package com.zh.service.impl;

import com.zh.bean.*;
import com.zh.dao.UserDao;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<Student> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<Echarts> getEchartsNum() {
        return userDao.getEchartsNum();
    }

    @Override
    public List<Stu> getStu() {
        return userDao.getStu();
    }

    @Override
    public List<Lou> getLou() {
        return userDao.getLou();
    }

    @Override
    public List<Dormitory> getDormitory() {
        return userDao.getDormitory();
    }

    @Override
    public int upd(Mi mi) {
        return userDao.upd(mi);
    }
}
