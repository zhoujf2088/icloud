package com.cloud.cases.vo;

import com.cloud.cases.BaseVO;

public class NaturalmanVO extends BaseVO{
	private String name;		//姓名
	private String nation;		//民族
	private int gender;			//性别
	private String Tel;			//手机号码
	private String country;		//国籍
	private String address;		//地址
	private String postcode;	//邮政编码
	private String landscape;	//政治面貌
	private String edulevel;	//文化程度
	private	int cardtpye;		//证件类型  0.身份证  1.军官证 2.警官证 3.士兵证  4.护照  5.律师执业证  6.学生证  7. 工作证  8.其它 
	private String cardnum;		//证件号码
	private int litistatus;		//诉讼地位   0.原告  1.被告  2.第三人  3.代理人  4.起诉人  5.申请人  6.被申请人
	
	private int litigationID;	//案件ID
	private String litigationName; //案件名称
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getLandscape() {
		return landscape;
	}
	public void setLandscape(String landscape) {
		this.landscape = landscape;
	}
	public String getEdulevel() {
		return edulevel;
	}
	public void setEdulevel(String edulevel) {
		this.edulevel = edulevel;
	}
	public int getCardtpye() {
		return cardtpye;
	}
	public void setCardtpye(int cardtpye) {
		this.cardtpye = cardtpye;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public int getLitistatus() {
		return litistatus;
	}
	public void setLitistatus(int litistatus) {
		this.litistatus = litistatus;
	}
	
	public int getLitigationID() {
		return litigationID;
	}
	public void setLitigationID(int litigationID) {
		this.litigationID = litigationID;
	}
	public String getLitigationName() {
		return litigationName;
	}
	public void setLitigationName(String litigationName) {
		this.litigationName = litigationName;
	}
	
	
}
