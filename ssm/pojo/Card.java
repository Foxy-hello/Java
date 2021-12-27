package com.bwie.ssm.pojo;

import java.io.Serializable;


public class Card implements Serializable{
	
	/**
	 * 用户卡主键id
	 */
	private Integer cardId;
	
	/**
	 * 户主名
	 */
	private String userName;
	
	/**
	 * 户主身份证号
	 */
	private String userIdNo;
	
	/**
	 * 卡余额
	 */
	private Double balance;
	
	public Card() {
		super();
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserIdNo() {
		return userIdNo;
	}

	public void setUserIdNo(String userIdNo) {
		this.userIdNo = userIdNo;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
 
}
