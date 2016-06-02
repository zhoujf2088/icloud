package com.cloud.cases.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/*
 * 角色信息表
 */
@Entity
@Description("角色信息表")
@Table(name="T_S_ROLE")
public class RoleEntity extends BaseEntity{

	private String rolename;			//角色名称
	private String roledesc;			//角色描述
	//角色与用户之间的多对多的关联，角色为维护端
	private Set<UserBaseInfoEntity> users = new HashSet<UserBaseInfoEntity>();
	//角色与功能表之间的多对多的关联，角色为维护端
	private Set<FunctionEntity> functions =new HashSet<FunctionEntity>();


	@Column(name="F_RoleName",length=80,nullable=false)
	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Column(name="F_RoleDesc",length=250)
	public String getRoledesc() {
		return roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

	public void setUsers(Set<UserBaseInfoEntity> users) {
		this.users = users;
	}
	
	@ManyToMany(cascade=CascadeType.REFRESH,fetch = FetchType.EAGER)
	@JoinTable(name="T_User_Role",inverseJoinColumns=@JoinColumn(name="F_UserID"),
			joinColumns=@JoinColumn(name="F_RoleID"))
	public Set<UserBaseInfoEntity> getUsers() {
		return users;
	}

	
	@ManyToMany(cascade=CascadeType.REFRESH,fetch = FetchType.EAGER)
	@JoinTable(name="T_Role_Function",inverseJoinColumns=@JoinColumn(name="F_FunctionID"),
			joinColumns=@JoinColumn(name="F_RoleID"))	
	public Set<FunctionEntity> getFunctions() {
		return functions;
	}
	public void setFunctions(Set<FunctionEntity> functions) {
		this.functions = functions;
	}
	
}
