package com.cloud.cases;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/*
 * 分页查询 类
 */
public class PageInfo implements Pageable{
	
	private  Integer nowPage = 1; // 当前页
	private  Integer eachPageData = 10; // 每页记录数
	private Integer pageCount = 0; // 总页数
	private Integer total = 0; // 总记录数

	public PageInfo(){}
	
	/**
	 * @param page 要查询的页码
	 * @param size 每页显示信息的条数
	 */
	public PageInfo(int page, int size) {
		this.nowPage=page;
		this.eachPageData=size;
	}
	
	public Integer getNowPage() {
		return nowPage;
	}

	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}

	public Integer getEachPageData() {
		return eachPageData;
	}

	public void setEachPageData(Integer eachPageData) {
		this.eachPageData = eachPageData;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	// 获取每页开始的记录所在的行数
	public Integer getStart() {
		return (nowPage - 1) * eachPageData;
	}

	// 获取每页的记录数
	public Integer getLimit() {
		return eachPageData;
	}

	@Override
	public int getPageNumber() {
		return this.nowPage;
	}

	@Override
	public int getPageSize() {
		return this.eachPageData;
	}

	@Override
	public int getOffset() {
		return 0;
	}

	@Override
	public Sort getSort() {
		return null;
	}

	@Override
	public Pageable next() {
		return new PageInfo(getPageNumber()+1, getPageSize());
	}

	@Override
	public Pageable previousOrFirst() {
		return new PageInfo(0, getPageSize());
	}

	@Override
	public Pageable first() {
		return new PageInfo(0, getPageSize());
	}

	@Override
	public boolean hasPrevious() {
		return false;
	}

	
	
}
