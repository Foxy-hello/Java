package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.UserDao;
import com.bawei.dao.UserDetailDao;
import com.bawei.pojo.User;
import com.bawei.pojo.UserDetail;
import com.bawei.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserDetailDao userDetailDao;
	
	@Override
	public List<User> findUserAll() {
		return userDao.findUserAll();
	}

	@Override
	public User findUserById(Integer id) {
		return userDao.findUserById(id);
	}

	@Override
	public boolean deleteUser(Integer id) {
		boolean bl=false;
		int result2=userDetailDao.deleteUserDeatail(id);
		int result1=userDao.deleteUser(id);
		if(result1>0 && result2>0){
			bl=true;
		}else{
			bl=false;
		}
		return bl;
	}

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public boolean insertUserAndDetail(User user, UserDetail userDetail) {
		boolean bl=false;
		int result1=userDao.insertUser(user);
		//获取当前新增用户主键id
		int userId=user.getId();
		userDetail.setUserId(userId);
		int result2=userDetailDao.insertUserDetail(userDetail);
		if(result1>0 && result2>0){
			bl=true;
		}else{
			bl=false;
		}
		return bl;
	}

	@Override
	public boolean updateUser(UserDetail userDetail, UserDetail detail) {
		boolean bl=false;
		if(userDetail!=null){
		//	3.1、用户详情表中存在数据  修改
			int result=userDetailDao.updateUserDetail(detail);
			if(result>0){
				bl=true;
			}else{
				bl=false;
			}
		}else{
		//	3.2、用户详情表中不存在数据  新增
			int result=userDetailDao.insertUserDetail(detail);
			if(result>0){
				bl=true;
			}else{
				bl=false;
			}
		}
		return bl;
	}

}
