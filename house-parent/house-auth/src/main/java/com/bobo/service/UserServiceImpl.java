package com.bobo.service;

import com.bobo.mapper.UserMapper;
import com.bobo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/6/9 15:53
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserMapper userMapper;
    @Override
    public User getByName(String name) {
        return userMapper.getByName(name);
    }
}
