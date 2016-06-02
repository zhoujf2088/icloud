package com.cloud.cases.vo;

import java.sql.Blob;

import com.cloud.cases.BaseVO;

public class EmployeeVO extends BaseVO{
	private String name;	//职员姓名
	private int gender;		//性别
	private String tel;		//职员手机号
	private Blob photo;		//职员照片
	private String Email;	//职员邮箱
	private String job;		//工作
	private String CVInfo;	//简要介绍
	
	private int departmentID;	//部门ID
	private String departmentName;//部门名称
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getCVInfo() {
		return CVInfo;
	}
	public void setCVInfo(String cVInfo) {
		CVInfo = cVInfo;
	}
}
