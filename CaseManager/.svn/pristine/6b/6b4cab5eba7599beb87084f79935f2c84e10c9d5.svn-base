package com.cloud.cases.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/*
 * 功能基本信息表
 */
@Entity
@Description("功能基本信息表")
@Table(name="T_S_Function")
public class FunctionEntity extends BaseEntity {

	private String functionname;			//功能名称
	private String functionurl;				//请求地址
	private String functiondesc;			//功能描述
	//功能表与模块表之间的多对一关联
	private ModuleInfoEntity modulinfo;
	


	@Column(name="F_FunctionName",length=60,nullable=false)
	public String getFunctionname() {
		return functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}
	
	@Column(name="F_FunctionURL",length=100)
	public String getFunctionurl() {
		return functionurl;
	}

	public void setFunctionurl(String functionurl) {
		this.functionurl = functionurl;
	}

	@Column(name="F_FunctionDesc",length=256)
	public String getFunctiondesc() {
		return functiondesc;
	}

	public void setFunctiondesc(String functiondesc) {
		this.functiondesc = functiondesc;
	}


	
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="F_ModuleID")
	public ModuleInfoEntity getModulinfo() {
		return modulinfo;
	}

	public void setModulinfo(ModuleInfoEntity modulinfo) {
		this.modulinfo = modulinfo;
	}	
	
		
}
