package com.accp.pojo;

public class Artificergrade {
    private Integer agid;

    private String agname;

    private Long agprice;

    public Integer getAgid() {
        return agid;
    }

    public void setAgid(Integer agid) {
        this.agid = agid;
    }

    public String getAgname() {
        return agname;
    }

    public void setAgname(String agname) {
        this.agname = agname == null ? null : agname.trim();
    }

    public Long getAgprice() {
        return agprice;
    }

    public void setAgprice(Long agprice) {
        this.agprice = agprice;
    }
}