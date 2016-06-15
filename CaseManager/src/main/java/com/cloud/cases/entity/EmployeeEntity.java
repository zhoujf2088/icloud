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
 * 
 * @author NB
 * @date 2016年5月31日 上午11:46:46
 */
@Entity
@Description("职员信息表")
@Table(name="T_employee")
public class EmployeeEntity extends BaseEntity {
	private String name;	//职员姓名
	private int gender;		//性别
	private String tel;		//职员手机号
	private Blob photo;		//职员照片
	private String Email;	//职员邮箱
	private String job;		//工作
	private String CVInfo;	//简要介绍
	
	private DepartmentEntity department;
	
	@Column(name="F_Name",length=36,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="F_Gender",nullable=false)
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Column(name="F_Tel",nullable=false,length=11)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Lob 
	@Basic(fetch=FetchType.LAZY) 
	@Column(name="F_Photo")
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	
	@Column(name="F_Email",length=32)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Column(name="F_Job",nullable=false,length=16)
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Column(name="F_CVInfo",length=512)
	public String getCVInfo() {
		return CVInfo;
	}
	public void setCVInfo(String cVInfo) {
		CVInfo = cVInfo;
	}
	
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="F_DepartmentID")
	public DepartmentEntity getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}
}
