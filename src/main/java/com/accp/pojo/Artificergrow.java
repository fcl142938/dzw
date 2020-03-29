package com.accp.pojo;

public class Artificergrow {
    private Integer gid;

    private String gname;

    private Long gprice;

    private Integer state;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Long getGprice() {
        return gprice;
    }

    public void setGprice(Long gprice) {
        this.gprice = gprice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}