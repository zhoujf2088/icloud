package com.cloud.cases.vo;

import java.util.Date;

import com.cloud.cases.BaseVO;
/**
 * 
 * @author NB
 *	案件表实体对应VO
 * @date 2016年6月2日 下午4:46:18
 */
public class LitigationVO extends BaseVO{
	private String name;				//名称
	private String deskCode;			//文案编号
	private int litigationKind;			//案件类型     1=诉讼类案件   0=执行类案件
	private int applyType;				//申请类型
	private String Description;			//诉讼描述
	private Date courtTime;				//开庭时间
	private String courtaddress;		//开庭地点
	private Double litigationAmount;	//标的金额
	private Double litigationfee;		//诉讼费用
	private int Checkfee;				//是否已缴费     1=未缴费   0=已缴费
	private String adjudicator;			//主审官
	private int state;					//状态    0=已提交   1.已受理  2.在审 3.已结案   4.移交  5.失败
	private String StateInfo;			//状态说明
	
	private int litigationResonId;  //案由ID
	private String litigationResonName;//案由名称
	
	private int applicantID;  //申请人ID
	private String applicantName;//申请人姓名
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeskCode() {
		return deskCode;
	}
	public void setDeskCode(String deskCode) {
		this.deskCode = deskCode;
	}
	public int getLitigationKind() {
		return litigationKind;
	}
	public void setLitigationKind(int litigationKind) {
		this.litigationKind = litigationKind;
	}
	public int getApplyType() {
		return applyType;
	}
	public void setApplyType(int applyType) {
		this.applyType = applyType;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getCourtTime() {
		return courtTime;
	}
	public void setCourtTime(Date courtTime) {
		this.courtTime = courtTime;
	}
	public String getCourtaddress() {
		return courtaddress;
	}
	public void setCourtaddress(String courtaddress) {
		this.courtaddress = courtaddress;
	}
	public Double getLitigationAmount() {
		return litigationAmount;
	}
	public void setLitigationAmount(Double litigationAmount) {
		this.litigationAmount = litigationAmount;
	}
	public Double getLitigationfee() {
		return litigationfee;
	}
	public void setLitigationfee(Double litigationfee) {
		this.litigationfee = litigationfee;
	}
	public int getCheckfee() {
		return Checkfee;
	}
	public void setCheckfee(int checkfee) {
		Checkfee = checkfee;
	}
	public String getAdjudicator() {
		return adjudicator;
	}
	public void setAdjudicator(String adjudicator) {
		this.adjudicator = adjudicator;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return StateInfo;
	}
	public void setStateInfo(String stateInfo) {
		StateInfo = stateInfo;
	}
	public int getLitigationResonId() {
		return litigationResonId;
	}
	public void setLitigationResonId(int litigationResonId) {
		this.litigationResonId = litigationResonId;
	}
	public String getLitigationResonName() {
		return litigationResonName;
	}
	public void setLitigationResonName(String litigationResonName) {
		this.litigationResonName = litigationResonName;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public void setApplicantID(int applicantID) {
		this.applicantID = applicantID;
	}
	
}
