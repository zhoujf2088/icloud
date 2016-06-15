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
 * @date 2016年6月4日 下午3:16:11
 */
@Entity
@Description("代理人信息表")
@Table(name="T_agent")
public class AgentEntity extends BaseEntity {
	private String agentname;	//姓名
	private String agentTel;	//电话
	private int agentType;		//代理人类型  0.律师  1.承担法律援助的律师   2.监护人   3.亲友  4.人民团体推荐人  5.所在单位推荐人 6.法院许可的其它公民  7.法律工作者
	private String address;		//地址
	private String postCode;	//邮政编码
	private String unitaddress;	//单位地址
	private int legalCardtype;	//证件类型   0.身份证  1.军官证 2.警官证 3.士兵证  4.护照  5.律师执业证  6.学生证  7. 工作证  8.其它 
	private String legalCardnum;//证件号码
	private int litiPart =0 ;	//所属方 0=原告方  1=被告方
	
	private LitigationEntity litigation;
	
	@Column(name="F_Agentname",nullable=false,length=20)
	public String getAgentname() {
		return agentname;
	}
	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}
	
	@Column(name="F_AgentTel",nullable=false,length=15)
	public String getAgentTel() {
		return agentTel;
	}
	public void setAgentTel(String agentTel) {
		this.agentTel = agentTel;
	}
	
	@Column(name="F_AgentType",nullable=false)
	public int getAgentType() {
		return agentType;
	}
	public void setAgentType(int agentType) {
		this.agentType = agentType;
	}
	
	@Column(name="F_Address",nullable=false,length=64)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="F_PostCode",length=6)
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	@Column(name="F_Unitaddress",length=64)
	public String getUnitaddress() {
		return unitaddress;
	}
	public void setUnitaddress(String unitaddress) {
		this.unitaddress = unitaddress;
	}
	
	@Column(name="F_LegalCardtype",nullable=false)
	public int getLegalCardtype() {
		return legalCardtype;
	}
	public void setLegalCardtype(int legalCardtype) {
		this.legalCardtype = legalCardtype;
	}
	
	@Column(name="F_LegalCardnum",nullable=false,length=32)
	public String getLegalCardnum() {
		return legalCardnum;
	}
	public void setLegalCardnum(String legalCardnum) {
		this.legalCardnum = legalCardnum;
	}
	
	@Column(name="F_litiPart")
	public int getLitiPart() {
		return litiPart;
	}
	public void setLitiPart(int litiPart) {
		this.litiPart = litiPart;
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
