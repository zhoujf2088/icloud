package com.cloud.cases.vo;

import java.sql.Blob;
import java.util.Date;

import com.cloud.cases.BaseVO;

public class GuideDoucumentVO extends BaseVO{

	private String name;	//文件名称
	private int print=1;	//打印
	private int guideType;	//文件所属类型
	private int type;		//文件类型
	private Date addtime;	//文件添加时间
	private Blob files;		//文件
	private int bPublic=1;	//是否公开
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrint() {
		return print;
	}
	public void setPrint(int print) {
		this.print = print;
	}
	public int getGuideType() {
		return guideType;
	}
	public void setGuideType(int guideType) {
		this.guideType = guideType;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Blob getFiles() {
		return files;
	}
	public void setFiles(Blob files) {
		this.files = files;
	}
	public int getbPublic() {
		return bPublic;
	}
	public void setbPublic(int bPublic) {
		this.bPublic = bPublic;
	}
}
