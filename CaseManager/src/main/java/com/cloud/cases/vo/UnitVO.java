package com.cloud.cases.vo;

import java.sql.Blob;

import com.cloud.cases.BaseVO;
/**
 * 单位组织信息实体对应VO
 * @author ZhouJF
 * @date 2016年6月12日 下午5:36:21
 */
public class UnitVO extends BaseVO {
	private String unitname;	//单位组织名称
	private String unitcode;	//组织结构代码
	private String tel;			//电话
	private String country;		//国家
	private String address;		//地址
	private String postCode;	//邮政编码
	private String legalname;	//代表人姓名
	private int legalCardtype;	//代表人证件类型  0.身份证  1.军官证 2.警官证 3.士兵证  4.护照  5.律师执业证  6.学生证  7. 工作证  8.其它 
	private String legalCardnum;//证件号码
	private int litistatus;		//诉讼地位   0.原告  1.被告  2.第三人  3.代理人  4.起诉人  5.申请人  6.被申请人
	private Blob unitFile;		//执照文件
	private int localunit=1;      //是否是法人组织   1=法人组织  0=非法人组织
	
	
	private int litigationID;	//案件ID
	private String litigationName; //案件名称
	
	
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public String getUnitcode() {
		return unitcode;
	}
	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getLegalname() {
		return legalname;
	}
	public void setLegalname(String legalname) {
		this.legalname = legalname;
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
	public int getLitistatus() {
		return litistatus;
	}
	public void setLitistatus(int litistatus) {
		this.litistatus = litistatus;
	}
	public Blob getUnitFile() {
		return unitFile;
	}
	public void setUnitFile(Blob unitFile) {
		this.unitFile = unitFile;
	}	
	public int getLocalunit() {
		return localunit;
	}
	public void setLocalunit(int localunit) {
		this.localunit = localunit;
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
