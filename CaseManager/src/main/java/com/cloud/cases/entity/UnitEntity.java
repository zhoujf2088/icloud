package com.cloud.cases.entity;

import java.sql.Blob;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;
/**
 * @author NB
 * @date 2016年6月4日 下午2:32:33
 */
@Entity
@Description("单位组织信息表")
@Table(name="T_Unit")
public class UnitEntity extends BaseEntity {
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
	
	private LitigationEntity litigation;
	
	
	@Column(name="F_Unitname",nullable=false,length=32)
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	
	@Column(name="F_Unitcode",nullable=false,length=32)
	public String getUnitcode() {
		return unitcode;
	}
	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}
	
	@Column(name="F_Tel",nullable=false,length=32)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Column(name="F_Country",length=32) 
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	@Column(name="F_Legalname",length=16) 
	public String getLegalname() {
		return legalname;
	}
	public void setLegalname(String legalname) {
		this.legalname = legalname;
	}
	
	@Column(name="F_LegalCardtype") 
	public int getLegalCardtype() {
		return legalCardtype;
	}
	public void setLegalCardtype(int legalCardtype) {
		this.legalCardtype = legalCardtype;
	}
	
	@Column(name="F_LegalCardnum",length=32) 
	public String getLegalCardnum() {
		return legalCardnum;
	}
	public void setLegalCardnum(String legalCardnum) {
		this.legalCardnum = legalCardnum;
	}
	
	@Column(name="F_Litistatus") 
	public int getLitistatus() {
		return litistatus;
	}
	public void setLitistatus(int litistatus) {
		this.litistatus = litistatus;
	}
	
	@Lob 
	@Basic(fetch=FetchType.LAZY) 
	@Column(name="F_UnitFile")
	public Blob getUnitFile() {
		return unitFile;
	}
	public void setUnitFile(Blob unitFile) {
		this.unitFile = unitFile;
	}
	@Column(name="F_localunit") 	
	public int getLocalunit() {
		return localunit;
	}
	public void setLocalunit(int localunit) {
		this.localunit = localunit;
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
