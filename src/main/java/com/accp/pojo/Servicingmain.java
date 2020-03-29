package com.accp.pojo;

import java.util.Date;

public class Servicingmain {
    private String smid;

    private Integer gid;

    private Integer userid;

    private Integer staffid;

    private Integer mid;

    private String consumerid;

    private Integer rescueid;

    private String consumermark;

    private Date starttime;

    private Date entime;

    private Long countprice;

    private Long price;

    private Integer state;

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid == null ? null : smid.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(String consumerid) {
        this.consumerid = consumerid == null ? null : consumerid.trim();
    }

    public Integer getRescueid() {
        return rescueid;
    }

    public void setRescueid(Integer rescueid) {
        this.rescueid = rescueid;
    }

    public String getConsumermark() {
        return consumermark;
    }

    public void setConsumermark(String consumermark) {
        this.consumermark = consumermark == null ? null : consumermark.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEntime() {
        return entime;
    }

    public void setEntime(Date entime) {
        this.entime = entime;
    }

    public Long getCountprice() {
        return countprice;
    }

    public void setCountprice(Long countprice) {
        this.countprice = countprice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}