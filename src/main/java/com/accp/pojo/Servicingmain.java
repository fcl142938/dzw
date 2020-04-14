package com.accp.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Servicingmain {
	
	@TableId(value = "smid")
    private String smid;

    private Integer gid;


    private Integer staffid;


    private Integer consumerid;

    private Integer rescueid;

    private String consumermark;

    private Date starttime;

    private Date entime;

    private Double countprice;

    private Double price;

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

  
    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }


    public Integer getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(Integer consumerid) {
        this.consumerid = consumerid ;
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

    public Double getCountprice() {
        return countprice;
    }

    public void setCountprice(Double countprice) {
        this.countprice = countprice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    
}