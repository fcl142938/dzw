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

    private Double makeintegral;

    private Double countintegral;

    private Double countmoney;

    private Double makemoney;

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

    public Double getMakeintegral() {
        return makeintegral;
    }

    public void setMakeintegral(Double makeintegral) {
        this.makeintegral = makeintegral;
    }

    public Double getCountintegral() {
        return countintegral;
    }

    public void setCountintegral(Double countintegral) {
        this.countintegral = countintegral;
    }

    public Double getCountmoney() {
        return countmoney;
    }

    public void setCountmoney(Double countmoney) {
        this.countmoney = countmoney;
    }

    public Double getMakemoney() {
        return makemoney;
    }

    public void setMakemoney(Double makemoney) {
        this.makemoney = makemoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public Memberinfo() {
		// TODO Auto-generated constructor stub
	}

	public Memberinfo(Integer memberid, Date medate, Double makeintegral, Double countintegral, Double countmoney,
			Double makemoney, Integer state, String smid) {
		super();
		this.memberid = memberid;
		this.medate = medate;
		this.makeintegral = makeintegral;
		this.countintegral = countintegral;
		this.countmoney = countmoney;
		this.makemoney = makemoney;
		this.state = state;
		this.smid = smid;
	}
    
}