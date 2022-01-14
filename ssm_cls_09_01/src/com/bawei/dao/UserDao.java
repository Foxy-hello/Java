package com.bawei.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bawei.pojo.User;

public interface UserDao {
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
	 * 根据id查询获取用户实体
	 * @param id 主键id
	 * @return 用户实体
	 */
	public User findUserById(@Param("id")Integer id);
	/**
	 * 根据id删除用户实体
	 * @param id 主键id
	 * @return 受影响行数
	 */
	public int deleteUser(@Param("id")Integer id);
}
