package com.bawei.pojo;

import java.util.Date;


/**
 * JSP页面：注意JSP页面输入框的 name属性值和POJO实体类的属性保持一致即可映射成功。
 */
public class User {
	private Integer id;
	private String username;
	private String sex;
	private Date birthday;
	//增加类的属性
	private ContactInfo contactInfo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	
}
