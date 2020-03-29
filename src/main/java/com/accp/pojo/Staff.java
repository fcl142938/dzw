package com.accp.pojo;

import java.util.Date;

public class Staff {
    private Integer staffid;

    private Integer departmentid;

    private String staffname;

    private String staffsex;

    private String staffaccount;

    private String staffpwd;

    private String saddress;

    private Date sstarttime;

    private Date sendtime;

    private Long price;

    private String idcd;

    private Integer state;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public String getStaffaccount() {
        return staffaccount;
    }

    public void setStaffaccount(String staffaccount) {
        this.staffaccount = staffaccount == null ? null : staffaccount.trim();
    }

    public String getStaffpwd() {
        return staffpwd;
    }

    public void setStaffpwd(String staffpwd) {
        this.staffpwd = staffpwd == null ? null : staffpwd.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public Date getSstarttime() {
        return sstarttime;
    }

    public void setSstarttime(Date sstarttime) {
        this.sstarttime = sstarttime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getIdcd() {
        return idcd;
    }

    public void setIdcd(String idcd) {
        this.idcd = idcd == null ? null : idcd.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}