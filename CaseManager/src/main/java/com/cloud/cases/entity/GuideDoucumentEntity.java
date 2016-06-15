package com.cloud.cases.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/**
 * 
 * @author NB
 * @date 2016年5月31日 上午10:57:07
 */
@Entity
@Description("指南文件信息表")
@Table(name="T_GUIDEDOCUMENT")
public class GuideDoucumentEntity extends BaseEntity {

	private String name;	//文件名称
	private int print=1;	//打印    1=打印 0=不打印
	private int guideType;	//文件所属类型   1=常用文书，如诉讼状  0=法律指导条文
	private int type;		//文件类型    doc pdf etc..
	private Date addtime;	//文件添加时间
	private Blob files;		//文件
	private int bPublic=1;	//是否公开  1=公开   0=不公开
	
	@Column(name="F_Name",length=48,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="F_print",nullable=false)
	public int getPrint() {
		return print;
	}
	public void setPrint(int print) {
		this.print = print;
	}
	
	@Column(name="F_guideType",nullable=false)
	public int getGuideType() {
		return guideType;
	}
	public void setGuideType(int guideType) {
		this.guideType = guideType;
	}
	
	@Column(name="F_Type")
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@Column(name="F_Addtime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	@Lob 
	@Basic(fetch=FetchType.LAZY) 
	@Column(name="F_files",columnDefinition="BLOB",nullable=false)
	public Blob getFiles() {
		return files;
	}
	public void setFiles(Blob files) {
		this.files = files;
	}
	
	@Column(name="F_bPublic")
	public int getbPublic() {
		return bPublic;
	}
	public void setbPublic(int bPublic) {
		this.bPublic = bPublic;
	}
}
