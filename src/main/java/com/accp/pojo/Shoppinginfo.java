package com.accp.pojo;

import java.util.Date;

public class Shoppinginfo {
    private Integer shid;

    private Integer materialid;

    private String shname;

    private Long slbuyprice;

    private Long slprice;

    private Date sldate;

    private Long buynumber;

    private Long slnumber;

    public Integer getShid() {
        return shid;
    }

    public void setShid(Integer shid) {
        this.shid = shid;
    }

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname == null ? null : shname.trim();
    }

    public Long getSlbuyprice() {
        return slbuyprice;
    }

    public void setSlbuyprice(Long slbuyprice) {
        this.slbuyprice = slbuyprice;
    }

    public Long getSlprice() {
        return slprice;
    }

    public void setSlprice(Long slprice) {
        this.slprice = slprice;
    }

    public Date getSldate() {
        return sldate;
    }

    public void setSldate(Date sldate) {
        this.sldate = sldate;
    }

    public Long getBuynumber() {
        return buynumber;
    }

    public void setBuynumber(Long buynumber) {
        this.buynumber = buynumber;
    }

    public Long getSlnumber() {
        return slnumber;
    }

    public void setSlnumber(Long slnumber) {
        this.slnumber = slnumber;
    }
}