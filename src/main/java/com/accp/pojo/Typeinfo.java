package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Typeinfo {
	
	@TableId(type = IdType.INPUT,value = "infoid")
    private Integer infoid;

    private Integer typeid;

    private String infoname;

    private Long price;

    private String infomark;

    public Integer getInfoid() {
        return infoid;
    } 

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getInfoname() {
        return infoname;
    }

    public void setInfoname(String infoname) {
        this.infoname = infoname == null ? null : infoname.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getInfomark() {
        return infomark;
    }

    public void setInfomark(String infomark) {
        this.infomark = infomark == null ? null : infomark.trim();
    }
}