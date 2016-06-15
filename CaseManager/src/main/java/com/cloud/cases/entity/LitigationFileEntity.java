package com.cloud.cases.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;
/**
 * 
 * @author NB
 * @date 2016年6月4日 下午3:09:58
 */
@Entity
@Description("诉讼材料信息表")
@Table(name="T_litigationFile")
public class LitigationFileEntity extends BaseEntity {
	private String name;		//文件名称
	private String fileType;	//文件类型  doc pdf etc...
	private Date addTime;		//文件添加时间
	private Blob files;			//文件
	private Date fileReceiveDate;//文件类型为裁定书时文案签收时间
	private int flieCategory;	//材料类别    0.起诉状  1.当事人身份证明 2.证据材料 3.申请执行书 4.生效裁判案卷 5.执行线索材料  6.案件裁定书
	
	private LitigationEntity litigation;
	
	
	@Column(name="F_Name",length=36,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="F_FileType")
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	@Column(name="F_Addtime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	@Lob 
	@Basic(fetch=FetchType.LAZY) 
	@Column(name="F_Files",columnDefinition="BLOB",nullable=false)
	public Blob getFiles() {
		return files;
	}
	public void setFiles(Blob files) {
		this.files = files;
	}
	
	@Column(name="F_FileReceiveDate")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFileReceiveDate() {
		return fileReceiveDate;
	}
	public void setFileReceiveDate(Date fileReceiveDate) {
		this.fileReceiveDate = fileReceiveDate;
	}
	
	@Column(name="F_FlieCategory",nullable=false)
	public int getFlieCategory() {
		return flieCategory;
	}
	public void setFlieCategory(int flieCategory) {
		this.flieCategory = flieCategory;
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
