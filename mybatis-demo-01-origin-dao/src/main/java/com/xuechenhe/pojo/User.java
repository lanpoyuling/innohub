package com.xuechenhe.pojo;

import java.io.Serializable;
import java.util.Date;

import com.xuechenhe.util.DateFormatUtil;

/**
 * 用户实体
 * 
 * @author Administrator
 *
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8831213844954531920L;
	/**
	 * int类型主键
	 */
	private int id;
	/**
	 * 用户名称
	 */
	private String username;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 地址
	 */
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	
	public String getSexCn(){
		String sexCn="";
		if(this.sex==null){
			return "";
		}
		if(this.sex.equals(new String("0"))){
			sexCn="男";
		}
		if(this.sex.equals(new String("1"))){
			sexCn="女";
		}
		return sexCn;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getBirthdayStr(){
		String dateStr=null;
		if(this.birthday!=null){
			dateStr=DateFormatUtil.convertDateToStr(this.birthday);
		}
		return dateStr;
		
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + this.getSexCn() + ", birthday=" + this.getBirthdayStr() + ", address="
				+ address + "]";
	}
	
	
}
