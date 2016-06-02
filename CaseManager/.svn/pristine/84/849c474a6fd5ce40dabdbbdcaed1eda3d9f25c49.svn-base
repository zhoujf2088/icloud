package com.cloud.cases.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/*
@Entity(name="后台用户基本信息表")
 * 后台用户基本信息表
 */
@Entity
@Description("后台用户基本信息表")
@Table(name="T_S_UserBaseInfo")
public class UserBaseInfoEntity extends BaseEntity{

	private String username;				//操作员名称
	private String password;				//操作员密码
	private String realname;				//真实名字
	private String tel;						//联系电话
	private int gender=1; 					//性别 0-女，1-男
	private int age;						//年龄
	private String email;					//邮箱
	private Date createdate;				//创建日期
	private Date lastlogintime;				//最后登录时间
	private int active =1;		 			//状态，0 - 停用状态， 1－启用状态

	//用户与角色表之间的多对多关系,角色为维护端
	private Set<RoleEntity> roles = new HashSet<RoleEntity>();
	
	//用户与操作信息表之间的一对多关系,操作信息表为维护端
	private Set<LogInfoEntity> logInfos= new HashSet<LogInfoEntity>();
	
	@Column(name="F_UserName",length=20,nullable=false,unique=true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="F_Password",columnDefinition="CHAR(32)",nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="F_Realname",length=20)
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	@Column(name="F_Tel",length=20)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Column(name="F_Gender")
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	@Column(name="F_Age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="F_Email",columnDefinition="CHAR(32)")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="F_CreateDate")
	@Temporal(TemporalType.TIMESTAMP)	
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@Column(name="F_Lastlogintime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	
	@Column(name="F_Active")
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
	@ManyToMany(cascade=CascadeType.REFRESH,mappedBy="users",fetch = FetchType.EAGER)
	public Set<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="userInfo")
	public Set<LogInfoEntity> getLogInfos() {
		return logInfos;
	}
	public void setLogInfos(Set<LogInfoEntity> logInfos) {
		this.logInfos = logInfos;
	}
	
	
	
}
