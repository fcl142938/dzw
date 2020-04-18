package com.accp.vo.tyh;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Members {
	@TableId(type = IdType.AUTO,value = "memberid")
    private Integer memberid;
    private Integer gradeid;
    private String membername;
    private String memberpwd;
    private Long memberintegrate;
    private Long countintegrate;
    private Long money;
    private Long countmoney;
    private Date starttime;
    private String gradename;
    private Long gradeagio;
    
    
	@Override
	public String toString() {
		return "Members [memberid=" + memberid + ", gradeid=" + gradeid + ", membername=" + membername + ", memberpwd="
				+ memberpwd + ", memberintegrate=" + memberintegrate + ", countintegrate=" + countintegrate + ", money="
				+ money + ", countmoney=" + countmoney + ", starttime=" + starttime + ", gradename=" + gradename
				+ ", gradeagio=" + gradeagio + "]";
	}

	public Members(Integer memberid, Integer gradeid, String membername, String memberpwd, Long memberintegrate,
			Long countintegrate, Long money, Long countmoney, Date starttime, String gradename, Long gradeagio) {
		super();
		this.memberid = memberid;
		this.gradeid = gradeid;
		this.membername = membername;
		this.memberpwd = memberpwd;
		this.memberintegrate = memberintegrate;
		this.countintegrate = countintegrate;
		this.money = money;
		this.countmoney = countmoney;
		this.starttime = starttime;
		this.gradename = gradename;
		this.gradeagio = gradeagio;
	}
	
	public Members() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
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
	public Long getCountmoney() {
		return countmoney;
	}
	public void setCountmoney(Long countmoney) {
		this.countmoney = countmoney;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public String getGradename() {
		return gradename;
	}
	public void setGradename(String gradename) {
		this.gradename = gradename;
	}
	public Long getGradeagio() {
		return gradeagio;
	}
	public void setGradeagio(Long gradeagio) {
		this.gradeagio = gradeagio;
	}
    
}
