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

    private Double memberintegrate;

    private Double countintegrate;

    private Double money;

    private Double countmoney;

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

    public Double getMemberintegrate() {
        return memberintegrate;
    }

    public void setMemberintegrate(Double memberintegrate) {
        this.memberintegrate = memberintegrate;
    }

    public Double getCountintegrate() {
        return countintegrate;
    }

    public void setCountintegrate(Double countintegrate) {
        this.countintegrate = countintegrate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getCountmoney() {
        return countmoney;
    }

    public void setCountmoney(Double countmoney) {
        this.countmoney = countmoney;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }
}