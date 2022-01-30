package com.bawei.pojo;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/*
 * 会议表
 */
public class Meeting {
	private int id;
	@NotNull(message="会议名称不能为空")
	@Size(min=1,max=180,message="最多只能输入180个字符")
	private String meetingName;
	
	@Pattern(regexp="\\d{4}-\\d{2}-\\d{2}",message="起始时间必须是yyyy-MM-dd格式")
	private String startTime;
	@Pattern(regexp="\\d{4}-\\d{2}-\\d{2}",message="结束时间必须是yyyy-MM-dd格式")
	private String endTime;
	private Address province;
	private Address city;
	private Address county;
	@NotEmpty(message="请输入会议地址")
	private String address;
	@NotNull(message="请输入联系人的姓名")
	@NotEmpty(message="请输入联系人的姓名")
	private String contact;
	@Pattern(regexp="\\d{0,4}-\\d{0,8}",message="区号最多4位数，号码最多8位数")
	private String telephone;
	@Pattern(regexp="\\d{11}",message="手机号为11位")
	private String mobilephone;
	@Size(min=2,max=100,message="长度不低于2个字符，不多于100个字符")
	private String introduce;
	private String image;
	@NotNull
	@Min(value=0)
	@Max(value=2)
	private int state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeetingName() {
		return meetingName;
	}
	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Address getProvince() {
		return province;
	}
	public void setProvince(Address province) {
		this.province = province;
	}
	public Address getCity() {
		return city;
	}
	public void setCity(Address city) {
		this.city = city;
	}
	public Address getCounty() {
		return county;
	}
	public void setCounty(Address county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}	
}
