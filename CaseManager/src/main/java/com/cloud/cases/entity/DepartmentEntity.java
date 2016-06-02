package com.cloud.cases.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/**
 * 
 * @author NB
 *
 * @date 2016年5月31日 上午11:39:12
 */
@Entity
@Description("部门表")
@Table(name="T_department ")
public class DepartmentEntity extends BaseEntity {
	private String name;	//部门名称
	private String manager;	//部门负责人
	private String address;	//部门地址
	private String description;	//部门简介
	private int superiorID;	//上级部门ID
	
	private Set<EmployeeEntity> employee = new HashSet<EmployeeEntity>();
	
	@Column(name="F_Name",length=36,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="F_Manager")
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	@Column(name="F_Address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="F_Description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="F_SuperiorID")
	public int getSuperiorID() {
		return superiorID;
	}
	public void setSuperiorID(int superiorID) {
		this.superiorID = superiorID;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="department")
	public Set<EmployeeEntity> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<EmployeeEntity> employee) {
		this.employee = employee;
	}
	
}
