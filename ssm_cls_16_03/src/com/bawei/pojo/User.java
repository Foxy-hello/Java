package com.bawei.pojo;

import java.util.List;

/*
 *  用户实体类
 */
public class User {
	private int id;
	private String userName;
	private String password;
	
	public User() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
