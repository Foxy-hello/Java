package com.bawei.service.impl;

import com.bawei.dao.UserDetailDao;
import com.bawei.service.UserDetailService;

public class UserDetailServiceImpl implements UserDetailService{
	private UserDetailDao userDetailDao;
	
	public UserDetailDao getUserDetailDao() {
		return userDetailDao;
	}

	public void setUserDetailDao(UserDetailDao userDetailDao) {
		this.userDetailDao = userDetailDao;
	}

	@Override
	public void testMethod() {
		userDetailDao.testMethod();
	}

}
