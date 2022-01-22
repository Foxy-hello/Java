package com.bawei.pojo;

public class Book {
	private Integer bId;
	private String bName;
	private String bAuthor;
	private String bPubdate;
	private Double bPrice;
	private String bPublisher;
	private String bDetail;
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbPubdate() {
		return bPubdate;
	}
	public void setbPubdate(String bPubdate) {
		this.bPubdate = bPubdate;
	}
	public Double getbPrice() {
		return bPrice;
	}
	public void setbPrice(Double bPrice) {
		this.bPrice = bPrice;
	}
	public String getbPublisher() {
		return bPublisher;
	}
	public void setbPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}
	public String getbDetail() {
		return bDetail;
	}
	public void setbDetail(String bDetail) {
		this.bDetail = bDetail;
	}
	
	@Override
	public String toString() {
		return "bId:"+bId+"   bName:"+bName+"   bAuthor:"+bAuthor+"   bPubdate:"+bPubdate+"   bPrice:"+bPrice+"   b_publisher:"+bPublisher+"   bDetail:"+bDetail;
	}
	public Book() {
		super();
	}
	
}
