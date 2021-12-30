package com.bawei.pojo;

public class UserDetail {
	private Integer id;
	private String nikeName;
	private String sex;
	private String telephone;
	private String email;
	private String company;
	private String dept;
	private String duty;
	private String photo;
	private Integer userId;
	public UserDetail() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNikeName() {
		return nikeName;
	}
	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "id:"+this.id+",昵称:"+this.nikeName+",性别:"+this.sex+",电话:"+
				this.telephone+",邮箱:"+this.email+",公司:"+this.company+",部门:"+this.dept+
				",职务:"+this.duty+",用户id:"+this.userId;
	}
}
