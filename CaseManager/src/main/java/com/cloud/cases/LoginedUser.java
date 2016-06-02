package com.cloud.cases;

import java.util.Date;

public class LoginedUser {
	private Integer id;				//用户ID
	private String username;		//用户名称
	private String realname;		//真实姓名
	private Date lastLoginTime;		//最后登录时间
	private String rightsURL;		//权限请求地址
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getRightsURL() {
		return rightsURL;
	}
	public void setRightsURL(String rightsURL) {
		this.rightsURL = rightsURL;
	}
	
    /**
     * 是否拥有某个权限
     */
    public Boolean containRights(String url) {
        return this.rightsURL.indexOf(url) != -1;
    }

    /**
     * 是否拥有某个模块
     */
    public Boolean containModule(String url) {
        return true;
    }
	
}
