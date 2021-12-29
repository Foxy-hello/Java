package com.bawei.service;

import com.bawei.pojo.User;

public interface UserService {
	/**
	 * 登录
	 * @param user 用户实体
	 * @return 
	 */
	public User login(User user);
}
