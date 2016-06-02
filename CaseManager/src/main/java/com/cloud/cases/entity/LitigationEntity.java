package com.cloud.cases.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
 * @author NB
 *
 * @date 2016年6月2日 下午3:57:17
 */
@Entity
@Description("案件信息表")
@Table(name="T_litigation")
public class LitigationEntity extends BaseEntity {
	private String name;				//名称
	private String ApplicantID;			//申请人ID
	private String deskCode;			//文案编号
	private String litigationresonID;	//涉案及由
	private int litigationKind;			//案件类型
	private int applyType;				//申请类型
	private String Description;			//诉讼描述
	private Date courtTime;				//开庭时间
	private String courtaddress;		//开庭地点
	private Double litigationAmount;	//标的金额
	private Double litigationfee;		//诉讼费用
	private int Checkfee;				//是否已缴费
	private String adjudicator;			//主审官
	private int state;					//状态
	private String StateInfo;			//状态说明
	
	//案件信息表与案由表之间的多对一关联
	private LitigationResonEntity litigationReson;
	//案件信息表与申请人基本信息表之间的多对一关联
	private ApplicantEntity  applicantEntity;
 
	//private Set<T> Ts = new HashSet<T>();
	
	
	@Column(name="F_Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name="F_ApplicantID")
	public String getApplicantID() {
		return ApplicantID;
	}
	public void setApplicantID(String applicantID) {
		ApplicantID = applicantID;
	}

	@Column(name="F_DeskCode")
	public String getDeskCode() {
		return deskCode;
	}
	public void setDeskCode(String deskCode) {
		this.deskCode = deskCode;
	}

	@Column(name="F_LitigationresonID",nullable=false)
	public String getLitigationresonID() {
		return litigationresonID;
	}
	public void setLitigationresonID(String litigationresonID) {
		this.litigationresonID = litigationresonID;
	}

	@Column(name="F_LitigationKind",nullable=false)
	public int getLitigationKind() {
		return litigationKind;
	}
	public void setLitigationKind(int litigationKind) {
		this.litigationKind = litigationKind;
	}

	@Column(name="F_ApplyType",nullable=false)
	public int getApplyType() {
		return applyType;
	}
	public void setApplyType(int applyType) {
		this.applyType = applyType;
	}

	@Column(name="F_Description",nullable=false)
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	@Column(name="F_CourtTime")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCourtTime() {
		return courtTime;
	}
	public void setCourtTime(Date courtTime) {
		this.courtTime = courtTime;
	}

	@Column(name="F_Courtaddress")
	public String getCourtaddress() {
		return courtaddress;
	}
	public void setCourtaddress(String courtaddress) {
		this.courtaddress = courtaddress;
	}

	@Column(name="F_LitigationAmount")
	public Double getLitigationAmount() {
		return litigationAmount;
	}
	public void setLitigationAmount(Double litigationAmount) {
		this.litigationAmount = litigationAmount;
	}

	@Column(name="F_Litigationfee")
	public Double getLitigationfee() {
		return litigationfee;
	}
	public void setLitigationfee(Double litigationfee) {
		this.litigationfee = litigationfee;
	}
	
	@Column(name="F_Checkfee")
	public int getCheckfee() {
		return Checkfee;
	}
	public void setCheckfee(int checkfee) {
		Checkfee = checkfee;
	}

	@Column(name="F_Adjudicator")
	public String getAdjudicator() {
		return adjudicator;
	}
	public void setAdjudicator(String adjudicator) {
		this.adjudicator = adjudicator;
	}

	@Column(name="F_State",nullable=false)
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	@Column(name="F_StateInfo")
	public String getStateInfo() {
		return StateInfo;
	}
	public void setStateInfo(String stateInfo) {
		StateInfo = stateInfo;
	}

	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="F_litigationResonID")
	public LitigationResonEntity getLitigationReson() {
		return litigationReson;
	}
	public void setLitigationReson(LitigationResonEntity litigationReson) {
		this.litigationReson = litigationReson;
	}
	
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.MERGE},optional=false)
	@JoinColumn(name="F_applicantID")
	public ApplicantEntity getApplicantEntity() {
		return applicantEntity;
	}
	public void setApplicantEntity(ApplicantEntity applicantEntity) {
		this.applicantEntity = applicantEntity;
	}
	
	
}
