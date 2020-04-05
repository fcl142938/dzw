package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.TableId;

public class Carbrand {
	
	@TableId(value = "brandid")
    private Integer brandid;


    private String brandname;

    private String brandletter;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandletter() {
        return brandletter;
    }

    public void setBrandletter(String brandletter) {
        this.brandletter = brandletter == null ? null : brandletter.trim();
    }
}