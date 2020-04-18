package com.accp.vo.tyh;

import java.util.Date;

public class MemberInfos {
	 private Integer mid;
	 private Integer memberid;
	 private String medate;
	 private Long makeintegral;
	 private Long countintegral;
	 private Long countmoney;
	 private Long makemoney;
	 private Integer state;
	 private String  smid;
	 
	 
	@Override
	public String toString() {
		return "MemberInfos [mid=" + mid + ", memberid=" + memberid + ", medate=" + medate + ", makeintegral="
				+ makeintegral + ", countintegral=" + countintegral + ", countmoney=" + countmoney + ", makemoney="
				+ makemoney + ", state=" + state + ", smid=" + smid + "]";
	}

	public MemberInfos(Integer mid, Integer memberid, String medate, Long makeintegral, Long countintegral,
			Long countmoney, Long makemoney, Integer state, String smid) {
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
	}
	
	public MemberInfos() {
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
	 
}
