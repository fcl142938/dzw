package com.accp.vo.tyh;

import java.util.Date;

public class tyhParticulars {
	private String smid;
	private String carnumber;
	private String motorcyclename;
	private String brandname;
	private Integer motorid;
	private String motorname;
	private String staffname;
	private String username;
	private String drivername;
	private String driverphone;
	private Double carcourse;
	private Date starttime;
	private Date entime;
	private Double countprice;
	private String userremark;
	private String consumermark;
	private Integer typeid;
	private String typename;
	private Integer typeparent;
	private Integer infoid;
	private String infoname;
	private Double price;
	private String infomark;
	private Integer siid;
	
	
	@Override
	public String toString() {
		return "tyhParticulars [smid=" + smid + ", carnumber=" + carnumber + ", motorcyclename=" + motorcyclename
				+ ", brandname=" + brandname + ", motorid=" + motorid + ", motorname=" + motorname + ", staffname="
				+ staffname + ", username=" + username + ", drivername=" + drivername + ", driverphone=" + driverphone
				+ ", carcourse=" + carcourse + ", starttime=" + starttime + ", entime=" + entime + ", countprice="
				+ countprice + ", userremark=" + userremark + ", consumermark=" + consumermark + ", typeid=" + typeid
				+ ", typename=" + typename + ", typeparent=" + typeparent + ", infoid=" + infoid + ", infoname="
				+ infoname + ", price=" + price + ", infomark=" + infomark + ", siid=" + siid + "]";
	}

	public tyhParticulars(String smid, String carnumber, String motorcyclename, String brandname, Integer motorid,
			String motorname, String staffname, String username, String drivername, String driverphone,
			Double carcourse, Date starttime, Date entime, Double countprice, String userremark, String consumermark,
			Integer typeid, String typename, Integer typeparent, Integer infoid, String infoname, Double price,
			String infomark, Integer siid) {
		super();
		this.smid = smid;
		this.carnumber = carnumber;
		this.motorcyclename = motorcyclename;
		this.brandname = brandname;
		this.motorid = motorid;
		this.motorname = motorname;
		this.staffname = staffname;
		this.username = username;
		this.drivername = drivername;
		this.driverphone = driverphone;
		this.carcourse = carcourse;
		this.starttime = starttime;
		this.entime = entime;
		this.countprice = countprice;
		this.userremark = userremark;
		this.consumermark = consumermark;
		this.typeid = typeid;
		this.typename = typename;
		this.typeparent = typeparent;
		this.infoid = infoid;
		this.infoname = infoname;
		this.price = price;
		this.infomark = infomark;
		this.siid = siid;
	}
	
	public tyhParticulars() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSmid() {
		return smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getMotorcyclename() {
		return motorcyclename;
	}
	public void setMotorcyclename(String motorcyclename) {
		this.motorcyclename = motorcyclename;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Integer getMotorid() {
		return motorid;
	}
	public void setMotorid(Integer motorid) {
		this.motorid = motorid;
	}
	public String getMotorname() {
		return motorname;
	}
	public void setMotorname(String motorname) {
		this.motorname = motorname;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Double getCarcourse() {
		return carcourse;
	}
	public void setCarcourse(Double carcourse) {
		this.carcourse = carcourse;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEntime() {
		return entime;
	}
	public void setEntime(Date entime) {
		this.entime = entime;
	}
	public Double getCountprice() {
		return countprice;
	}
	public void setCountprice(Double countprice) {
		this.countprice = countprice;
	}
	public String getUserremark() {
		return userremark;
	}
	public void setUserremark(String userremark) {
		this.userremark = userremark;
	}
	public String getConsumermark() {
		return consumermark;
	}
	public void setConsumermark(String consumermark) {
		this.consumermark = consumermark;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public Integer getTypeparent() {
		return typeparent;
	}
	public void setTypeparent(Integer typeparent) {
		this.typeparent = typeparent;
	}
	public Integer getInfoid() {
		return infoid;
	}
	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}
	public String getInfoname() {
		return infoname;
	}
	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getInfomark() {
		return infomark;
	}
	public void setInfomark(String infomark) {
		this.infomark = infomark;
	}
	public Integer getSiid() {
		return siid;
	}
	public void setSiid(Integer siid) {
		this.siid = siid;
	}
	
}
