package com.accp.vo.lyf;

import java.util.Date;

public class LyfClzlVo {
	private Integer consumerid;
	private String carnumber;
	private String brandname;
	private String motorcyclename;
	private String drivername;
	private String driverphone;
	private Date driverbrithday;
	private String motorletter;
	private String motorname;
	public Integer getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(Integer consumerid) {
		this.consumerid = consumerid;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getMotorcyclename() {
		return motorcyclename;
	}
	public void setMotorcyclename(String motorcyclename) {
		this.motorcyclename = motorcyclename;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getDriverphone() {
		return driverphone;
	}
	public void setDriverphone(String driverphone) {
		this.driverphone = driverphone;
	}
	public Date getDriverbrithday() {
		return driverbrithday;
	}
	public void setDriverbrithday(Date driverbrithday) {
		this.driverbrithday = driverbrithday;
	}
	public String getMotorletter() {
		return motorletter;
	}
	public void setMotorletter(String motorletter) {
		this.motorletter = motorletter;
	}
	public String getMotorname() {
		return motorname;
	}
	public void setMotorname(String motorname) {
		this.motorname = motorname;
	}
	public LyfClzlVo(Integer consumerid, String carnumber, String brandname, String motorcyclename, String drivername,
			String driverphone, Date driverbrithday, String motorletter, String motorname) {
		super();
		this.consumerid = consumerid;
		this.carnumber = carnumber;
		this.brandname = brandname;
		this.motorcyclename = motorcyclename;
		this.drivername = drivername;
		this.driverphone = driverphone;
		this.driverbrithday = driverbrithday;
		this.motorletter = motorletter;
		this.motorname = motorname;
	}
	public LyfClzlVo() {
		super();
	}
	
	
}
