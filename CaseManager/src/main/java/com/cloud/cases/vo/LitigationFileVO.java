package com.cloud.cases.vo;

import java.sql.Blob;
import java.util.Date;

import com.cloud.cases.BaseVO;
/**
 * 诉讼材料信息实体对应VO
 * @author ZhouJF
 * @date 2016年6月12日 下午5:36:57
 */
public class LitigationFileVO extends BaseVO {
	private String name;		//文件名称
	private String fileType;	//文件类型  doc pdf .等
	private Date addTime;		//文件添加时间
	private Blob files;			//文件
	private Date fileReceiveDate;//文件类型为裁定书时文案签收时间
	private int flieCategory;	//材料类别    0.起诉状  1.当事人身份证明 2.证据材料 3.申请执行书 4.生效裁判案卷 5.执行线索材料  6.案件裁定书
		
	private int litigationID;	//案件ID
	private String litigationName;//案件名称
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Blob getFiles() {
		return files;
	}
	public void setFiles(Blob files) {
		this.files = files;
	}
	public Date getFileReceiveDate() {
		return fileReceiveDate;
	}
	public void setFileReceiveDate(Date fileReceiveDate) {
		this.fileReceiveDate = fileReceiveDate;
	}
	public int getFlieCategory() {
		return flieCategory;
	}
	public void setFlieCategory(int flieCategory) {
		this.flieCategory = flieCategory;
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
