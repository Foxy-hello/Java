package com.zh.service.impl;

import com.zh.bean.User;
import com.zh.dao.UserDao;
import com.zh.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean findName(String name) {
        return userDao.findName(name);
    }

    @Override
    public int insertUser(User user) {
        String newPwd = DigestUtils.md5Hex(user.getPwd() + SALT + user.getName());
        user.setPwd(newPwd);
        return userDao.insertUser(user);
    }

    @Override
    public int login(String name, String pwd) {
        String newPwd = DigestUtils.md5Hex(pwd + SALT + name);
        return userDao.login(name,newPwd);
    }


}
