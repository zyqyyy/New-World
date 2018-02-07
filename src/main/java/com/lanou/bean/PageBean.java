package com.lanou.bean;

import java.util.List;

public class PageBean<T> {
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 总条数
	 */
	private int totalCount;
	/**
	 * 一页显示的长度
	 */
	private int pageSize;
	/**
	 * 页码
	 */
	private int pageNo;
	/**
	 * 一页显示的内容
	 */
	private List<T> list;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getTotalPage() {
		return this.getTotalCount()%this.getPageSize()==0?this.getTotalCount()/this.getPageSize():this.getTotalCount()/this.getPageSize()+1;
	}
	
	
	
	
} 
