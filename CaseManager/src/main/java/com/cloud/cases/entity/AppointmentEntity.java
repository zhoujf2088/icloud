package com.cloud.cases.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;
/**
 * 
 * @author NB
 * @date 2016年6月4日 下午3:44:18
 */
@Entity
@Description("预约信息表")
@Table(name="T_appointment")
public class AppointmentEntity extends BaseEntity {
	private String adjudicator;	//法官
	private Date addtime;		//发起预约的时间
	private Date appointTime;	//预约时间
	private int Ifnotice;		//告知法官    1=预约信息已告知法官   0=未告知法官
	private String message;		//留言信息
	private int apointResult;	//预约结果    1=预约成功   0=预约失败
	private String reason;		//原因
	
	private LitigationEntity litigation;
	
	
	@Column(name="F_Adjudicator",nullable=false,length=16)
	public String getAdjudicator() {
		return adjudicator;
	}
	public void setAdjudicator(String adjudicator) {
		this.adjudicator = adjudicator;
	}
	
	@Column(name="F_Addtime",nullable=false)
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	@Column(name="F_AppointTime",nullable=false)
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	
	@Column(name="F_Ifnotice")
	public int getIfnotice() {
		return Ifnotice;
	}
	public void setIfnotice(int ifnotice) {
		Ifnotice = ifnotice;
	}
	
	@Column(name="F_Message",length=256)
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Column(name="F_ApointResult")
	public int getApointResult() {
		return apointResult;
	}
	public void setApointResult(int apointResult) {
		this.apointResult = apointResult;
	}
	
	@Column(name="F_Reason",length=128)
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="T_litigationID")
	public LitigationEntity getLitigation() {
		return litigation;
	}
	public void setLitigation(LitigationEntity litigation) {
		this.litigation = litigation;
	}
	
}
