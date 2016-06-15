package com.cloud.cases.entity;

import java.sql.Blob;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;
/**
 * 
 * @author ZhouJF
 * @date 2016年5月31日 上午11:28:52
 */
@Entity
@Description("申请人扩展信息表")
@Table(name="T_ApplicantEx")
public class ApplicantExEntity extends BaseEntity {
	
	private String tel;			//申请人电话号码
	private Blob cameraphoto;	//摄像头照片
	private String email;		//邮箱
	private String qq;			//qq号码
	private String nowaddress;	//现在居住地址
	private String othercontact;//其它联系方式
	private int kind=0;			//申请人类型  0=代表当事人，1=代理律师，2=代理人
	
	//此扩展信息表与申请人基本信息表是一对一关系，且此实体为维护端。
	private ApplicantEntity applicantEntity;

	@Column(name="F_tel",length=11,nullable=false)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Lob 
	@Basic(fetch=FetchType.LAZY) 
	@Column(name="F_cameraphoto",columnDefinition="BLOB")
	public Blob getCameraphoto() {
		return cameraphoto;
	}
	public void setCameraphoto(Blob cameraphoto) {
		this.cameraphoto = cameraphoto;
	}

	@Column(name="F_email",length=32)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="F_qq",length=16)
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name="F_nowaddress",length=64,nullable=false)
	public String getNowaddress() {
		return nowaddress;
	}
	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}

	@Column(name="F_othercontact",length=64)
	public String getOthercontact() {
		return othercontact;
	}
	public void setOthercontact(String othercontact) {
		this.othercontact = othercontact;
	}

	@Column(name="F_kind")
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}

	@OneToOne(mappedBy = "applicantExEntity",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},optional = true)
	public ApplicantEntity getApplicantEntity() {
		return applicantEntity;
	}
	public void setApplicantEntity(ApplicantEntity applicantEntity) {
		this.applicantEntity = applicantEntity;
	}

	
}
