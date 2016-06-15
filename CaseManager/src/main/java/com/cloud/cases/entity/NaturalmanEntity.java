package com.cloud.cases.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/**
 * 
 * @author NB
 *
 * @date 2016年6月4日 上午11:19:12
 */
@Entity
@Description("自然人信息表")
@Table(name="T_naturalman")
public class NaturalmanEntity extends BaseEntity {
	private String name;		//姓名
	private String nation;		//民族
	private int gender=1;		//性别  1=男  0=女
	private String Tel;			//手机号码
	private String country;		//国籍
	private String address;		//地址
	private String postcode;	//邮政编码
	private String landscape;	//政治面貌
	private String edulevel;	//文化程度
	private	int cardtpye=0;		//证件类型  0.身份证  1.军官证 2.警官证 3.士兵证  4.护照  5.律师执业证  6.学生证  7. 工作证  8.其它 
	private String cardnum;		//证件号码
	private int litistatus;		//诉讼地位   0.原告  1.被告  2.第三人  3.代理人  4.起诉人  5.申请人  6.被申请人
	
	//案件信息表与自然人信息表之间的多对一关联
	private LitigationEntity litigation;

	
	@Column(name="F_name",nullable=false,length=32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="F_nation",length=16)
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Column(name="F_Gender")
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Column(name="F_Tel",nullable=false,length=11)
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	
	@Column(name="F_Country",length=32)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="F_Address",length=64)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="F_Postcode",length=6)
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	@Column(name="F_Landscape",length=16)
	public String getLandscape() {
		return landscape;
	}
	public void setLandscape(String landscape) {
		this.landscape = landscape;
	}
	
	@Column(name="F_edulevel",length=16)
	public String getEdulevel() {
		return edulevel;
	}
	public void setEdulevel(String edulevel) {
		this.edulevel = edulevel;
	}
	
	@Column(name="F_Cardtpye",nullable=false)
	public int getCardtpye() {
		return cardtpye;
	}
	public void setCardtpye(int cardtpye) {
		this.cardtpye = cardtpye;
	}
	
	@Column(name="F_Cardnum",nullable=false,length=32)
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	
	@Column(name="F_Litistatus")
	public int getLitistatus() {
		return litistatus;
	}
	public void setLitistatus(int litistatus) {
		this.litistatus = litistatus;
	}
	
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="T_litigationID")
	public LitigationEntity getLitigation() {
		return litigation;
	}
	public void setLitigation(LitigationEntity litigation) {
		this.litigation = litigation;
	}
	
}
