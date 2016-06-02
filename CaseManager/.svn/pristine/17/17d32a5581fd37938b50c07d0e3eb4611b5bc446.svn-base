package com.cloud.cases;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String  id;
	private String text;
	private String iconCls;
	private String parentId;
	private String state;		//open,closed
	private Boolean checked;
	private List<TreeNode> children;
	
	
	public TreeNode() {
		super();
	}
	
	
	public TreeNode(String id, String text, String iconCls, String parentId,
			List<TreeNode> children) {
		super();
		this.id = id;
		this.text = text;
		this.iconCls = iconCls;
		this.parentId = parentId;
		this.children = children;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	
	


	public Boolean getChecked() {
		return checked;
	}


	public void setChecked(Boolean checked) {
		this.checked = checked;
	}


	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
	//添加子节点
	public void addChild(TreeNode node){
		if(this.children==null){
			children=new ArrayList<TreeNode>();
		}
		children.add(node);
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
}
