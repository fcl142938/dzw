package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Memberinfo {
	
	@TableId(type = IdType.AUTO,value = "mid")
    private Integer mid;

    private Integer memberid;
    
    private Date medate;

    private Long makeintegral;

    private Long countintegral;

    private Long countmoney;

    private Long makemoney;

    private Integer state;
    
    private String  smid;
    

    public String getSmid() {
		return smid;
	}

	public void setSmid(String smid) {
		this.smid = smid;
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

    public Date getMedate() {
        return medate;
    }

    public void setMedate(Date medate) {
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
}