package com.accp.pojo;

public class Carbrand {
    private Integer brandid;

    private Integer motorcycleid;

    private String brandname;

    private String brandletter;

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