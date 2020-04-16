package com.accp.vo.tyh;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class SettlementCenter {
	//servicingmain
	private String smid;
	private Integer gid;
	private Integer userid;
	private Integer staffid;
	private Integer mid;
	private Integer consumerid;
	private Integer rescueid;
	private String consumermark;
	@JSONField(format="yyyy-MM-dd")
	private Date starttime;
	@JSONField(format="yyyy-MM-dd")
	private Date entime;
	private String countprice;
	private String price;
	private Integer state;
	//artificergrow
	private String gname;
	private String gprice;
	//consumerinfo
	private String username;
	private String userphone;
	private String useraddress;
	private String userbrithday;
	private String userremark;
	//staff
	private Integer positionid;
	private String staffname;
	private String staffsex;
	private String staffaccount;
	private String staffpwd;
	private String saddress;
	@JSONField(format="yyyy-MM-dd")
	private Date sstarttime;
	@JSONField(format="yyyy-MM-dd")
	private Date sendtime;
	private String sfprice;
	private String idcd;
	//consumercar
	private Integer motorcycleid;
	private String carnumber;
	private String drivername;
	private String driverphone;
	@JSONField(format="yyyy-MM-dd")
	private Date driverbrithday;
	@JSONField(format="yyyy-MM-dd")
	private Date driverdate;
	private String carcourse;
	@JSONField(format="yyyy-MM-dd")
	private Date buycar;
	//rescuecar
	private String rescuenumber;
	private String renumber;
	//memberinfo
	private Integer memberid;
	@JSONField(format="yyyy-MM-dd")
	private Date medate;
	private String makeintegral;
	private String countintegral;
	private String countmoney;
	private String makemoney;
	//motorcycle
	private Integer motorid;
	private String motorcyclename;
	private String motorcycleprice;
	private Integer brandid;
	
	
	@Override
	public String toString() {
		return "SettlementCenter [smid=" + smid + ", gid=" + gid + ", userid=" + userid + ", staffid=" + staffid
				+ ", mid=" + mid + ", consumerid=" + consumerid + ", rescueid=" + rescueid + ", consumermark="
				+ consumermark + ", starttime=" + starttime + ", entime=" + entime + ", countprice=" + countprice
				+ ", price=" + price + ", state=" + state + ", gname=" + gname + ", gprice=" + gprice + ", username="
				+ username + ", userphone=" + userphone + ", useraddress=" + useraddress + ", userbrithday="
				+ userbrithday + ", userremark=" + userremark + ", positionid=" + positionid + ", staffname="
				+ staffname + ", staffsex=" + staffsex + ", staffaccount=" + staffaccount + ", staffpwd=" + staffpwd
				+ ", saddress=" + saddress + ", sstarttime=" + sstarttime + ", sendtime=" + sendtime + ", sfprice="
				+ sfprice + ", idcd=" + idcd + ", motorcycleid=" + motorcycleid + ", carnumber=" + carnumber
				+ ", drivername=" + drivername + ", driverphone=" + driverphone + ", driverbrithday=" + driverbrithday
				+ ", driverdate=" + driverdate + ", carcourse=" + carcourse + ", buycar=" + buycar + ", rescuenumber="
				+ rescuenumber + ", renumber=" + renumber + ", memberid=" + memberid + ", medate=" + medate
				+ ", makeintegral=" + makeintegral + ", countintegral=" + countintegral + ", countmoney=" + countmoney
				+ ", makemoney=" + makemoney + ", motorid=" + motorid + ", motorcyclename=" + motorcyclename
				+ ", motorcycleprice=" + motorcycleprice + ", brandid=" + brandid + "]";
	}

	public SettlementCenter(String smid, Integer gid, Integer userid, Integer staffid, Integer mid, Integer consumerid,
			Integer rescueid, String consumermark, Date starttime, Date entime, String countprice, String price,
			Integer state, String gname, String gprice, String username, String userphone, String useraddress,
			String userbrithday, String userremark, Integer positionid, String staffname, String staffsex,
			String staffaccount, String staffpwd, String saddress, Date sstarttime, Date sendtime, String sfprice,
			String idcd, Integer motorcycleid, String carnumber, String drivername, String driverphone,
			Date driverbrithday, Date driverdate, String carcourse, Date buycar, String rescuenumber, String renumber,
			Integer memberid, Date medate, String makeintegral, String countintegral, String countmoney,
			String makemoney, Integer motorid, String motorcyclename, String motorcycleprice, Integer brandid) {
		super();
		this.smid = smid;
		this.gid = gid;
		this.userid = userid;
		this.staffid = staffid;
		this.mid = mid;
		this.consumerid = consumerid;
		this.rescueid = rescueid;
		this.consumermark = consumermark;
		this.starttime = starttime;
		this.entime = entime;
		this.countprice = countprice;
		this.price = price;
		this.state = state;
		this.gname = gname;
		this.gprice = gprice;
		this.username = username;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.userbrithday = userbrithday;
		this.userremark = userremark;
		this.positionid = positionid;
		this.staffname = staffname;
		this.staffsex = staffsex;
		this.staffaccount = staffaccount;
		this.staffpwd = staffpwd;
		this.saddress = saddress;
		this.sstarttime = sstarttime;
		this.sendtime = sendtime;
		this.sfprice = sfprice;
		this.idcd = idcd;
		this.motorcycleid = motorcycleid;
		this.carnumber = carnumber;
		this.drivername = drivername;
		this.driverphone = driverphone;
		this.driverbrithday = driverbrithday;
		this.driverdate = driverdate;
		this.carcourse = carcourse;
		this.buycar = buycar;
		this.rescuenumber = rescuenumber;
		this.renumber = renumber;
		this.memberid = memberid;
		this.medate = medate;
		this.makeintegral = makeintegral;
		this.countintegral = countintegral;
		this.countmoney = countmoney;
		this.makemoney = makemoney;
		this.motorid = motorid;
		this.motorcyclename = motorcyclename;
		this.motorcycleprice = motorcycleprice;
		this.brandid = brandid;
	}
	
	public SettlementCenter() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSmid() {
		return smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(Integer consumerid) {
		this.consumerid = consumerid;
	}
	public Integer getRescueid() {
		return rescueid;
	}
	public void setRescueid(Integer rescueid) {
		this.rescueid = rescueid;
	}
	public String getConsumermark() {
		return consumermark;
	}
	public void setConsumermark(String consumermark) {
		this.consumermark = consumermark;
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
	public String getCountprice() {
		return countprice;
	}
	public void setCountprice(String countprice) {
		this.countprice = countprice;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserbrithday() {
		return userbrithday;
	}
	public void setUserbrithday(String userbrithday) {
		this.userbrithday = userbrithday;
	}
	public String getUserremark() {
		return userremark;
	}
	public void setUserremark(String userremark) {
		this.userremark = userremark;
	}
	public Integer getPositionid() {
		return positionid;
	}
	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
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
	public String getStaffaccount() {
		return staffaccount;
	}
	public void setStaffaccount(String staffaccount) {
		this.staffaccount = staffaccount;
	}
	public String getStaffpwd() {
		return staffpwd;
	}
	public void setStaffpwd(String staffpwd) {
		this.staffpwd = staffpwd;
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
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	public String getSfprice() {
		return sfprice;
	}
	public void setSfprice(String sfprice) {
		this.sfprice = sfprice;
	}
	public String getIdcd() {
		return idcd;
	}
	public void setIdcd(String idcd) {
		this.idcd = idcd;
	}
	public Integer getMotorcycleid() {
		return motorcycleid;
	}
	public void setMotorcycleid(Integer motorcycleid) {
		this.motorcycleid = motorcycleid;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
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
	public Date getDriverdate() {
		return driverdate;
	}
	public void setDriverdate(Date driverdate) {
		this.driverdate = driverdate;
	}
	public String getCarcourse() {
		return carcourse;
	}
	public void setCarcourse(String carcourse) {
		this.carcourse = carcourse;
	}
	public Date getBuycar() {
		return buycar;
	}
	public void setBuycar(Date buycar) {
		this.buycar = buycar;
	}
	public String getRescuenumber() {
		return rescuenumber;
	}
	public void setRescuenumber(String rescuenumber) {
		this.rescuenumber = rescuenumber;
	}
	public String getRenumber() {
		return renumber;
	}
	public void setRenumber(String renumber) {
		this.renumber = renumber;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public Date getMedate() {
		return medate;
	}
	public void setMedate(Date medate) {
		this.medate = medate;
	}
	public String getMakeintegral() {
		return makeintegral;
	}
	public void setMakeintegral(String makeintegral) {
		this.makeintegral = makeintegral;
	}
	public String getCountintegral() {
		return countintegral;
	}
	public void setCountintegral(String countintegral) {
		this.countintegral = countintegral;
	}
	public String getCountmoney() {
		return countmoney;
	}
	public void setCountmoney(String countmoney) {
		this.countmoney = countmoney;
	}
	public String getMakemoney() {
		return makemoney;
	}
	public void setMakemoney(String makemoney) {
		this.makemoney = makemoney;
	}
	public Integer getMotorid() {
		return motorid;
	}
	public void setMotorid(Integer motorid) {
		this.motorid = motorid;
	}
	public String getMotorcyclename() {
		return motorcyclename;
	}
	public void setMotorcyclename(String motorcyclename) {
		this.motorcyclename = motorcyclename;
	}
	public String getMotorcycleprice() {
		return motorcycleprice;
	}
	public void setMotorcycleprice(String motorcycleprice) {
		this.motorcycleprice = motorcycleprice;
	}
	public Integer getBrandid() {
		return brandid;
	}
	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}
	
}
