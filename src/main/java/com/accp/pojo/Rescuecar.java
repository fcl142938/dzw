package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Rescuecar {
	
	@TableId(type = IdType.AUTO,value = "rescueid")
    private Integer rescueid;

    private String rescuenumber;

    private String renumber;

    private Integer state;
    
    private Double price;
    

    public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRescueid() {
        return rescueid;
    }

    public void setRescueid(Integer rescueid) {
        this.rescueid = rescueid;
    }

    public String getRescuenumber() {
        return rescuenumber;
    }

    public void setRescuenumber(String rescuenumber) {
        this.rescuenumber = rescuenumber == null ? null : rescuenumber.trim();
    }

    public String getRenumber() {
        return renumber;
    }

    public void setRenumber(String renumber) {
        this.renumber = renumber == null ? null : renumber.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}