package com.accp.vo.tyh;

public class tyhMemberInfo {
	private Integer mid;
	 private Integer memberid;
	 private String medate;
	 private Long makeintegral;
	 private Long countintegral;
	 private Long countmoney;
	 private Long makemoney;
	 private Integer state;
	 private String  smid;
	 private Integer gradeid;
	 private String membername;
	 private String memberpwd;
	 private Long memberintegrate;
	 private Long countintegrate;
	 private Long money;
	 
	 
	@Override
	public String toString() {
		return "tyhMemberInfo [mid=" + mid + ", memberid=" + memberid + ", medate=" + medate + ", makeintegral="
				+ makeintegral + ", countintegral=" + countintegral + ", countmoney=" + countmoney + ", makemoney="
				+ makemoney + ", state=" + state + ", smid=" + smid + ", gradeid=" + gradeid + ", membername="
				+ membername + ", memberpwd=" + memberpwd + ", memberintegrate=" + memberintegrate + ", countintegrate="
				+ countintegrate + ", money=" + money + "]";
	}

	public tyhMemberInfo(Integer mid, Integer memberid, String medate, Long makeintegral, Long countintegral,
			Long countmoney, Long makemoney, Integer state, String smid, Integer gradeid, String membername,
			String memberpwd, Long memberintegrate, Long countintegrate, Long money) {
		super();
		this.mid = mid;
		this.memberid = memberid;
		this.medate = medate;
		this.makeintegral = makeintegral;
		this.countintegral = countintegral;
		this.countmoney = countmoney;
		this.makemoney = makemoney;
		this.state = state;
		this.smid = smid;
		this.gradeid = gradeid;
		this.membername = membername;
		this.memberpwd = memberpwd;
		this.memberintegrate = memberintegrate;
		this.countintegrate = countintegrate;
		this.money = money;
	}
	
	public tyhMemberInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public String getMedate() {
		return medate;
	}
	public void setMedate(String medate) {
		this.medate = medate;
	}
	public Long getMakeintegral() {
		return makeintegral;
	}
	public void setMakeintegral(Long makeintegral) {
		this.makeintegral = makeintegral;
	}
	public Long getCountintegral() {
		return countintegral;
	}
	public void setCountintegral(Long countintegral) {
		this.countintegral = countintegral;
	}
	public Long getCountmoney() {
		return countmoney;
	}
	public void setCountmoney(Long countmoney) {
		this.countmoney = countmoney;
	}
	public Long getMakemoney() {
		return makemoney;
	}
	public void setMakemoney(Long makemoney) {
		this.makemoney = makemoney;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getSmid() {
		return smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberpwd() {
		return memberpwd;
	}
	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}
	public Long getMemberintegrate() {
		return memberintegrate;
	}
	public void setMemberintegrate(Long memberintegrate) {
		this.memberintegrate = memberintegrate;
	}
	public Long getCountintegrate() {
		return countintegrate;
	}
	public void setCountintegrate(Long countintegrate) {
		this.countintegrate = countintegrate;
	}
	public Long getMoney() {
		return money;
	}
	public void setMoney(Long money) {
		this.money = money;
	}
	 
}
