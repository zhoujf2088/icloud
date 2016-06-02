package com.cloud.cases.vo;

import com.cloud.cases.BaseVO;

public class FunctionVO extends BaseVO {
	private String functionname;			//功能名称
	private String functionurl;				//请求地址
	private String functiondesc;			//功能描述
	
	private Integer modulid;				//模块ID
	private String modulename;				//模块名称
	
	public String getFunctionname() {
		return functionname;
	}
	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}
	public String getFunctionurl() {
		return functionurl;
	}
	public void setFunctionurl(String functionurl) {
		this.functionurl = functionurl;
	}
	public String getFunctiondesc() {
		return functiondesc;
	}
	public void setFunctiondesc(String functiondesc) {
		this.functiondesc = functiondesc;
	}
	public Integer getModulid() {
		return modulid;
	}
	public void setModulid(Integer modulid) {
		this.modulid = modulid;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	

}
