package com.accp.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Member {
	
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
        this.membername = membername == null ? null : membername.trim();
    }

    public String getMemberpwd() {
        return memberpwd;
    }

    public void setMemberpwd(String memberpwd) {
        this.memberpwd = memberpwd == null ? null : memberpwd.trim();
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
}