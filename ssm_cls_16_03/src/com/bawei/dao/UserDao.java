package com.bawei.dao;

import com.bawei.pojo.User;

public interface UserDao {
	/**
	 * 登录
	 * @param user 用户实体
	 * @return 
	 */
	public User login(User user);
}
