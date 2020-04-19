package com.accp.vo.lyf;

public class LyfWxjlVo {
	private String smid;
	private String gname;
	private String rescuenumber;
	private String consumerid;
	private String consumermark;
	private String starttime;
	private String entime;
	private String countprice;
	private String price;
	private String state;
	private String staffname;
	public String getSmid() {
		return smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getRescuenumber() {
		return rescuenumber;
	}
	public void setRescuenumber(String rescuenumber) {
		this.rescuenumber = rescuenumber;
	}
	public String getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}
	public String getConsumermark() {
		return consumermark;
	}
	public void setConsumermark(String consumermark) {
		this.consumermark = consumermark;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEntime() {
		return entime;
	}
	public void setEntime(String entime) {
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public LyfWxjlVo(String smid, String gname, String rescuenumber, String consumerid, String consumermark,
			String starttime, String entime, String countprice, String price, String state, String staffname) {
		super();
		this.smid = smid;
		this.gname = gname;
		this.rescuenumber = rescuenumber;
		this.consumerid = consumerid;
		this.consumermark = consumermark;
		this.starttime = starttime;
		this.entime = entime;
		this.countprice = countprice;
		this.price = price;
		this.state = state;
		this.staffname = staffname;
	}
	public LyfWxjlVo() {
		super();
	}
}
