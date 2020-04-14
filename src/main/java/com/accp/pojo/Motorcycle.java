package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Motorcycle {
	
	@TableId(type = IdType.AUTO,value = "motorcycleid")
    private Integer motorcycleid;

    private Integer motorid;

    private String motorcyclename;

    private Long motorcycleprice;
    
    private Integer brandid;
    

    public Integer getBrandid() {
		return brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public Integer getMotorcycleid() {
        return motorcycleid;
    }

    public void setMotorcycleid(Integer motorcycleid) {
        this.motorcycleid = motorcycleid;
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
        this.motorcyclename = motorcyclename == null ? null : motorcyclename.trim();
    }

    public Long getMotorcycleprice() {
        return motorcycleprice;
    }

    public void setMotorcycleprice(Long motorcycleprice) {
        this.motorcycleprice = motorcycleprice;
    }
}