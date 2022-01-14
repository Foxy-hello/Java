package com.bawei.dao;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.UserDetail;

public interface UserDetailDao {
	/**
	 * 新增用户详情数据  
	 * @param userDetail 用户详情实体类
	 * @return  受影响行数
	 */
	public int insertUserDetail(UserDetail userDetail);
	/**
	 * 根据用户id查询用户详细信息
	 * @param userId 用户id
	 * @return 用户详细信息
	 */
	public UserDetail findUserDeatailByUserId(@Param("userId")Integer userId);
	/**
	 * 修改用户详情信息
	 * @param userDetail 用户详情对象
	 * @return 受影响行数
	 */
	public int updateUserDetail(UserDetail userDetail);
	/**
	 * 删除用户信息
	 * @param id 主键id
	 * @return 受影响行数
	 */
	public int deleteUserDeatail(@Param("userId")Integer userId);
}
