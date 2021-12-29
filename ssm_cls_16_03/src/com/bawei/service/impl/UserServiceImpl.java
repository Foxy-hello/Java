package com.bawei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.UserDao;
import com.bawei.pojo.User;
import com.bawei.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
