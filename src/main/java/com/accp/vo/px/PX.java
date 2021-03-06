package com.accp.vo.px;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PX {
	private  Integer staffid;
	private  String departmentname;
	private  String  positionname;
	private  String staffname;
	private  String staffsex;
	private  String saddress;
	private String staffaccount;
	private String staffpwd;
	private String idcd;
    @JSONField(format = "yyyy-MM-dd")
	private  Date sstarttime;
    @JSONField(format = "yyyy-MM-dd")
    private Date sendtime;
	private  Integer price;
	private Integer positionid;
	
	
	public Integer getPositionid() {
		return positionid;
	}
	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}
	public String getStaffpwd() {
		return staffpwd;
	}
	public void setStaffpwd(String staffpwd) {
		this.staffpwd = staffpwd;
	}
	public String getIdcd() {
		return idcd;
	}
	public void setIdcd(String idcd) {
		this.idcd = idcd;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getPositionname() {
		return positionname;
	}
	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffsex() {
		return staffsex;
	}
	public void setStaffsex(String staffsex) {
		this.staffsex = staffsex;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Date getSstarttime() {
		return sstarttime;
	}
	public void setSstarttime(Date sstarttime) {
		this.sstarttime = sstarttime;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStaffaccount() {
		return staffaccount;
	}
	public void setStaffaccount(String staffaccount) {
		this.staffaccount = staffaccount;
	}
	
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	@Override
	public String toString() {
		return "PX [staffid=" + staffid + ", departmentname=" + departmentname + ", positionname=" + positionname
				+ ", staffname=" + staffname + ", staffsex=" + staffsex + ", saddress=" + saddress + ", staffaccount="
				+ staffaccount + ", sstarttime=" + sstarttime + ", price=" + price + "]";
	}
	
	
	
	
	

}
