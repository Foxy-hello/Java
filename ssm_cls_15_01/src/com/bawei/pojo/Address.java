package com.bawei.pojo;
/*
 * 地址表
 */
public class Address {
	private int id;
	private String addressName;
	private int pid;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Address() {
		super();
	}
	
}
