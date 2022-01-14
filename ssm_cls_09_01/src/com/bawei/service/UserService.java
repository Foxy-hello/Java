package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.User;
import com.bawei.pojo.UserDetail;

public interface UserService {
	/**
	 * 查询所有用户信息
	 * @return
	 */
	public List<User> findUserAll();
	/**
	 * 插入用户数据   用户表
	 * @param user 用户实体
	 * @return 受影响行数
	 */
	public int insertUser(User user);
	/**
	 * 插入用户数据  用户表  用户详情表
	 * @param user  用户信息
	 * @param userDetail 用户详情信息
	 * @return 受影响行数
	 */
	public boolean insertUserAndDetail(User user,UserDetail userDetail);
	/**
	 * 根据id删除用户实体
	 * @param id 主键id
	 * @return 受影响行数
	 */
	public boolean deleteUser(@Param("id")Integer id);
	/**
	 * 根据id查询获取用户实体
	 * @param id 主键id
	 * @return 用户实体
	 */
	public User findUserById(@Param("id")Integer id);
	/**
	 * 修改用户信息
	 * @param userDetail 根据id查询的用户详情实体对象
	 * @param detail  修改或者新增的实体对象
	 * @return
	 */
	public boolean updateUser(UserDetail userDetail, UserDetail detail);
	
}
