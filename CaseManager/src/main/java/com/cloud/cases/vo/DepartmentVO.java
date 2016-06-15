package com.cloud.cases.vo;

import com.cloud.cases.BaseVO;

public class DepartmentVO extends BaseVO{
	private String name;	//部门名称
	private String manager;	//部门负责人
	private String address;	//部门地址
	private String description;	//部门简介
	private int superiorID;	//上级部门ID
	private String otherInfo; //部门其它说明
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSuperiorID() {
		return superiorID;
	}
	public void setSuperiorID(int superiorID) {
		this.superiorID = superiorID;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	
}
