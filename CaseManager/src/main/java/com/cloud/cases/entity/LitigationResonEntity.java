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
 * @date 2016年6月2日 下午3:44:18
 */
@Entity
@Description("案由表")
@Table(name="T_litigationReson")
public class LitigationResonEntity extends BaseEntity {
	
	private String typeName;	//名称
	private String Description;	//描述
	private int superiorID;		//父ID	
	
	//
	private Set<LitigationEntity> litigations = new HashSet<LitigationEntity>();
	
	@Column(name="F_TypeName",nullable=false,length=32)
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@Column(name="F_Description",length=512)
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	@Column(name="SuperiorID")
	public int getSuperiorID() {
		return superiorID;
	}
	public void setSuperiorID(int superiorID) {
		this.superiorID = superiorID;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="litigationReson")
	public Set<LitigationEntity> getLitigations() {
		return litigations;
	}
	public void setLitigations(Set<LitigationEntity> litigations) {
		this.litigations = litigations;
	}
	
}
