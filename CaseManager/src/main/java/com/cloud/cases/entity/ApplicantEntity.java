package com.cloud.cases.entity;

import java.sql.Blob;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;
/**
 * @author ZhouJF
 * @date 2016年5月31日 上午11:22:41
 */
@Entity
@Description("申请人基本信息表")
@Table(name="T_Applicant")
public class ApplicantEntity extends BaseEntity {
	
    private String cardID;		//身份证号码
    private String username;	//申请人姓名
    private String password;	//登陆密码
    private String origin;		//籍贯
    private int gender;			//性别   1=男  0=女
    private Blob cardphoto;		//身份证上的照片
    private String registeraddress;//户口所在地址
    private String nation;		// 名族
    private Blob fingerprint;	//指纹信息
    
    //基本信息表与此扩展表是双向一对一关联，且扩展表为维护端
    private ApplicantExEntity applicantExEntity;
    
    
    @Column(name="F_cardID",length=18,nullable=false,unique=true)
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	
	 @Column(name="F_username",length=20,nullable=false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	 @Column(name="F_password",length=32,nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	 @Column(name="F_origin",length=16,nullable=false)
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	@Column(name="F_gender",nullable=false)
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	@Lob 
	@Basic(fetch=FetchType.LAZY) 
	@Column(name="F_cardphoto",columnDefinition="BLOB")
	public Blob getCardphoto() {
		return cardphoto;
	}
	public void setCardphoto(Blob cardphoto) {
		this.cardphoto = cardphoto;
	}
	
	@Column(name="F_registeraddress",nullable=false)
	public String getRegisteraddress() {
		return registeraddress;
	}
	public void setRegisteraddress(String registeraddress) {
		this.registeraddress = registeraddress;
	}
	
	@Column(name="F_nation",nullable=false)
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Column(name="F_fingerprint")
	public Blob getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(Blob fingerprint) {
		this.fingerprint = fingerprint;
	}
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "F_ApplicantExID")
	public ApplicantExEntity getApplicantExEntity() {
		return applicantExEntity;
	}
	public void setApplicantExEntity(ApplicantExEntity applicantExEntity) {
		this.applicantExEntity = applicantExEntity;
	}
    
    
    
    
}
