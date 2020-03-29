package com.accp.pojo;

import java.util.Date;

public class Artificer {
    private Integer aid;

    private Integer positionid;

    private Integer agid;

    private Integer gid;

    private String aname;

    private String aaccount;

    private String apwd;

    private Date startime;

    private Date endtime;

    private Integer state;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Integer getAgid() {
        return agid;
    }

    public void setAgid(Integer agid) {
        this.agid = agid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAaccount() {
        return aaccount;
    }

    public void setAaccount(String aaccount) {
        this.aaccount = aaccount == null ? null : aaccount.trim();
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd == null ? null : apwd.trim();
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}