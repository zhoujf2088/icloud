package com.cloud.cases.vo;

import java.sql.Blob;

import com.cloud.cases.BaseVO;

public class ApplicantExVO extends BaseVO {

	private String tel;			//申请人电话号码
	private Blob cameraphoto;	//摄像头照片
	private String email;		//邮箱
	private String qq;			//qq号码
	private String nowaddress;	//现在居住地址
	private String othercontact;//其它联系方式
	private int kind=0;			//申请人类型  0=代表当事人，1=代理律师，2=代理人
	
	private int applicantID;
	private String applicantusername;
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Blob getCameraphoto() {
		return cameraphoto;
	}
	public void setCameraphoto(Blob cameraphoto) {
		this.cameraphoto = cameraphoto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getNowaddress() {
		return nowaddress;
	}
	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}
	public String getOthercontact() {
		return othercontact;
	}
	public void setOthercontact(String othercontact) {
		this.othercontact = othercontact;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public int getApplicantID() {
		return applicantID;
	}
	public void setApplicantID(int applicantID) {
		this.applicantID = applicantID;
	}
	
	public String getApplicantusername() {
		return applicantusername;
	}
	public void setApplicantusername(String applicantusername) {
		this.applicantusername = applicantusername;
	}
		
}
