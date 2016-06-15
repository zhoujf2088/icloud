package com.cloud.cases.vo;

import java.util.Date;

import com.cloud.cases.BaseVO;
/**
 * 预约信息实体对应该VO
 * @author ZhouJF
 * @date 2016年6月12日 下午6:07:57
 */
public class AppointmentVO extends BaseVO {
	private String adjudicator;	//法官
	private Date addtime;		//发起预约的时间
	private Date appointTime;	//预约时间
	private int Ifnotice;		//告知法官    1=预约信息已告知法官   0=未告知法官
	private String message;		//留言信息
	private int apointResult;	//预约结果    1=预约成功   0=预约失败
	private String reason;		//原因
	
	private int litigationID;	//案件信息表ID
	private String litigationName;//案件信息名称
	
	
	public String getAdjudicator() {
		return adjudicator;
	}
	public void setAdjudicator(String adjudicator) {
		this.adjudicator = adjudicator;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	public int getIfnotice() {
		return Ifnotice;
	}
	public void setIfnotice(int ifnotice) {
		Ifnotice = ifnotice;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getApointResult() {
		return apointResult;
	}
	public void setApointResult(int apointResult) {
		this.apointResult = apointResult;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public int getLitigationID() {
		return litigationID;
	}
	public void setLitigationID(int litigationID) {
		this.litigationID = litigationID;
	}
	public String getLitigationName() {
		return litigationName;
	}
	public void setLitigationName(String litigationName) {
		this.litigationName = litigationName;
	}
	
}
