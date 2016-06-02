package com.cloud.cases.vo;

import com.cloud.cases.BaseVO;

public class RoleVO extends BaseVO{
	private String rolename;			//角色名称
	private String roledesc;			//角色描述
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledesc() {
		return roledesc;
	}
	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}
	
}
