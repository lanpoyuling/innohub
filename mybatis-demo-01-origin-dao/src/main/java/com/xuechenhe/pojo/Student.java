package com.xuechenhe.pojo;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4610831674076173578L;
	/**
	 * 字符串类型主键
	 */
	private String id;
	/**
	 * 
	 */
	private String stuName;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + "]";
	}
	
	
	
	

}
