package com.cloud.cases.vo;

import com.cloud.cases.BaseVO;
/**
 * 代理人信息实体对应VO
 * @author NB
 * @date 2016年6月12日 下午6:00:24
 */
public class AgentVO extends BaseVO {
	private String agentname;	//姓名
	private String agentTel;	//电话
	private int agentType;		//代理人类型  0.律师  1.承担法律援助的律师   2.监护人   3.亲友  4.人民团体推荐人  5.所在单位推荐人 6.法院许可的其它公民  7.法律工作者
	private String address;		//地址
	private String postCode;	//邮政编码
	private String unitaddress;	//单位地址
	private int legalCardtype;	//证件类型   0.身份证  1.军官证 2.警官证 3.士兵证  4.护照  5.律师执业证  6.学生证  7. 工作证  8.其它 
	private String legalCardnum;//证件号码
	private int litiPart =0 ;	//所属方 0=原告方  1=被告方
	
	private int litigationID;	//案件ID
	private String litigationName;//案件名称
	
	
	public String getAgentname() {
		return agentname;
	}
	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}
	public String getAgentTel() {
		return agentTel;
	}
	public void setAgentTel(String agentTel) {
		this.agentTel = agentTel;
	}
	public int getAgentType() {
		return agentType;
	}
	public void setAgentType(int agentType) {
		this.agentType = agentType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getUnitaddress() {
		return unitaddress;
	}
	public void setUnitaddress(String unitaddress) {
		this.unitaddress = unitaddress;
	}
	public int getLegalCardtype() {
		return legalCardtype;
	}
	public void setLegalCardtype(int legalCardtype) {
		this.legalCardtype = legalCardtype;
	}
	public String getLegalCardnum() {
		return legalCardnum;
	}
	public void setLegalCardnum(String legalCardnum) {
		this.legalCardnum = legalCardnum;
	}
	public int getLitiPart() {
		return litiPart;
	}
	public void setLitiPart(int litiPart) {
		this.litiPart = litiPart;
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
