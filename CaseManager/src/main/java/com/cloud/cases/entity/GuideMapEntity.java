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
 *
 * @date 2016年5月31日 上午11:34:39
 */
@Entity
@Description("法院区域指引表")
@Table(name="T_guidemap")
public class GuideMapEntity extends BaseEntity {
	private String name;		//名称
	private String description;	//说明
	private Blob picture;		//图片
	private String adduser;		//图片上传者
	private Date addTime;		//上传时间
	
	@Column(name="F_Name",length=36,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="F_Description",length=256)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Lob 
	@Basic(fetch=FetchType.LAZY)
	@Column(name="F_Picture",nullable=false)
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	
	@Column(name="F_adduser")
	public String getAdduser() {
		return adduser;
	}
	public void setAdduser(String adduser) {
		this.adduser = adduser;
	}
	
	@Column(name="F_AddTime",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
