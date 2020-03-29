package com.accp.pojo;

import java.util.Date;

public class Consumercar {
    private String consumerid;

    private Integer userid;

    private Integer motorcycleid;

    private String carnumber;

    private String drivername;

    private String driverphone;

    private Date driverbrithday;

    private Date driverdate;

    private Long carcourse;

    private Date buycar;

    public String getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(String consumerid) {
        this.consumerid = consumerid == null ? null : consumerid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMotorcycleid() {
        return motorcycleid;
    }

    public void setMotorcycleid(Integer motorcycleid) {
        this.motorcycleid = motorcycleid;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public Date getDriverbrithday() {
        return driverbrithday;
    }

    public void setDriverbrithday(Date driverbrithday) {
        this.driverbrithday = driverbrithday;
    }

    public Date getDriverdate() {
        return driverdate;
    }

    public void setDriverdate(Date driverdate) {
        this.driverdate = driverdate;
    }

    public Long getCarcourse() {
        return carcourse;
    }

    public void setCarcourse(Long carcourse) {
        this.carcourse = carcourse;
    }

    public Date getBuycar() {
        return buycar;
    }

    public void setBuycar(Date buycar) {
        this.buycar = buycar;
    }
}