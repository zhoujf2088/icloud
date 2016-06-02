package com.cloud.cases.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;

/**
 * 
 * @author ZhouJF
 * @date 2016年5月25日 上午10:25:15
 */
@Entity
@Description("用户操作日志信息表")
@Table(name="T_S_LogInfo")
public class LogInfoEntity extends BaseEntity {

	private Date operatetime;	//操作时间
	private int opteratetype;	//操作类型    0-增加 1-删除   2-修改    3-查看
	private String tablename;	//表名
    private int tableinnerID;//操作表中内容对应该的ID;
    
    private UserBaseInfoEntity userInfo;
    
	 @Column(name="F_operatetime",nullable=false)
	 @Temporal(TemporalType.TIMESTAMP)
	public Date getOperatetime() {
		return operatetime;
	}
	public void setOperatetime(Date operatetime) {
		this.operatetime = operatetime;
	}
	
	@Column(name="F_operatetype",nullable=false)
	public int getOpteratetype() {
		return opteratetype;
	}
	public void setOpteratetype(int opteratetype) {
		this.opteratetype = opteratetype;
	}
	
	@Column(name="F_tablename",length=32,nullable=false)
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	@Column(name="F_tableinnerID",nullable=false)
	public int getTableinnerID() {
		return tableinnerID;
	}
	public void setTableinnerID(int tableinnerID) {
		this.tableinnerID = tableinnerID;
	}
	
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="F_UserBaseInfoID")
	public UserBaseInfoEntity getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserBaseInfoEntity userInfo) {
		this.userInfo = userInfo;
	}
    
	
}
