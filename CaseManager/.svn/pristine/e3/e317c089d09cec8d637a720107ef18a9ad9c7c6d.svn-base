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

//模块信息实体类

@Entity
@Description("模块信息表")
@Table(name="T_S_ModuleInfo")
public class ModuleInfoEntity extends BaseEntity{

	private String modulename;			//模块名称
	private String moduledesc;			//模块描述
	//模块表与功能表之间的一对多的关联，由功能表维护
	private Set<FunctionEntity> functions = new HashSet<FunctionEntity>();


	@Column(name="F_Modulename",length=60,nullable=false)
	public String getModulename() {
		return modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}

	@Column(name="F_ModuleDesc",length=256)
	public String getModuledesc() {
		return moduledesc;
	}

	public void setModuledesc(String moduledesc) {
		this.moduledesc = moduledesc;
	}

	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="modulinfo")
	public Set<FunctionEntity> getFunctions() {
		return functions;
	}

	public void setFunctions(Set<FunctionEntity> functions) {
		this.functions = functions;
	}
	
	
}
