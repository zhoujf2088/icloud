package com.cloud.cases.vo;

import java.util.ArrayList;
import java.util.List;

import com.cloud.cases.BaseVO;

public class MenuVO extends BaseVO {
	 private Integer id;
	 private String menuname;               //菜单名称;
     private String menudesc;               //菜单描述;
     private String menuurl;                //菜单请求地址;
     private String menuregex;              //菜单正则表达式 ; 
     private String menuico;                //菜单图标文件;
     private List<MenuVO> subMenuVOs =new ArrayList<MenuVO>();		//子菜单
     private MenuVO parentMenuVO;			//父菜单
     private Integer parentId;				//父菜单ID
     private String parentName;				//父菜单名称
     
     
     
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	
	public String getMenudesc() {
		return menudesc;
	}
	public void setMenudesc(String menudesc) {
		this.menudesc = menudesc;
	}
	
	public String getMenuurl() {
		return menuurl;
	}
	public void setMenuurl(String menuurl) {
		this.menuurl = menuurl;
	}
	
	public String getMenuregex() {
		return menuregex;
	}
	public void setMenuregex(String menuregex) {
		this.menuregex = menuregex;
	}
	
	public String getMenuico() {
		return menuico;
	}
	public void setMenuico(String menuico) {
		this.menuico = menuico;
	}

	public List<MenuVO> getSubMenuVOs() {
		return subMenuVOs;
	}
	public void setSubMenuVOs(List<MenuVO> subMenuVOs) {
		this.subMenuVOs = subMenuVOs;
	}

	public MenuVO getParentMenuVO() {
		return parentMenuVO;
	}
	public void setParentMenuVO(MenuVO parentMenuVO) {
		this.parentMenuVO = parentMenuVO;
	}

	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
