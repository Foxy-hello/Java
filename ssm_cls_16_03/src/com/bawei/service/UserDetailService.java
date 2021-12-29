package com.bawei.service;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.UserDetail;

public interface UserDetailService {
	/**
	 * 根据用户id查询用户详细信息
	 * @param userId 用户id
	 * @return 用户详细信息
	 */
	public UserDetail findUserDeatailByUserId(@Param("userId")Integer userId);
}
