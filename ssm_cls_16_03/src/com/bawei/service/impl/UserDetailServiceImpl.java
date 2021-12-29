package com.bawei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.UserDetailDao;
import com.bawei.pojo.UserDetail;
import com.bawei.service.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService{
	@Autowired
	private UserDetailDao userDetailDao;

	@Override
	public UserDetail findUserDeatailByUserId(Integer userId) {
		return userDetailDao.findUserDeatailByUserId(userId);
	}
}
