 package com.cloud.cases.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cloud.cases.BaseEntity;
import com.sun.org.glassfish.gmbal.Description;


@Entity
@Description("项目目录信息表")
@Table(name="T_MENU")
public class MenuEntity extends BaseEntity{
	

	//菜单名称
    private String menuname;
	
	//菜单描述
    private String menudesc;
    
    //菜单请求地址
    private String menuurl;
    
    //菜单正则表达�?
    private String menuregex;
    
    //菜单图标文件
    private String menuico;
    
    //主菜单对应子菜单：一对多 双向
    private List<MenuEntity> subMenu = new ArrayList<MenuEntity>();
    
  //子菜单对应父菜单：多对一 双向
    private MenuEntity parentMenu;



	@Column(name="F_MENUNAME",nullable = false,length=30)  
    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    @Column(name="F_MENUDESC",length = 200)
    public String getMenudesc() {
        return menudesc;
    }

    public void setMenudesc(String menudesc) {
        this.menudesc = menudesc;
    }

    @Column(name="F_MENUURL",length = 200)
    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    @Column(name="F_MENUREGEX",length = 200)
    public String getMenuregex() {
        return menuregex;
    }

    public void setMenuregex(String menuregex) {
        this.menuregex = menuregex;
    }

 
    @Column(name="F_MENUICO",length = 200)
    public String getMenuico() {
        return menuico;
    }

    public void setMenuico(String menuico) {
        this.menuico = menuico;
    }

  
    @OneToMany(cascade = CascadeType.ALL,mappedBy="parentMenu",targetEntity=MenuEntity.class)
    public List<MenuEntity> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<MenuEntity> subMenu) {
        this.subMenu = subMenu;
    }


    @ManyToOne(targetEntity=MenuEntity.class)
    @JoinColumn(name="F_MENU_PARENT_ID")   
    public MenuEntity getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(MenuEntity parentMenu) {
        this.parentMenu = parentMenu;
    }

	
}
