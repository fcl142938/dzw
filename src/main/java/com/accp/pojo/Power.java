package com.accp.pojo;

public class Power {
    private Integer powerid;

    private String powername;

    private Integer powerparent;

    private String powersrc;

    public Integer getPowerid() {
        return powerid;
    }

    public void setPowerid(Integer powerid) {
        this.powerid = powerid;
    }

    public String getPowername() {
        return powername;
    }

    public void setPowername(String powername) {
        this.powername = powername == null ? null : powername.trim();
    }

    public Integer getPowerparent() {
        return powerparent;
    }

    public void setPowerparent(Integer powerparent) {
        this.powerparent = powerparent;
    }

    public String getPowersrc() {
        return powersrc;
    }

    public void setPowersrc(String powersrc) {
        this.powersrc = powersrc == null ? null : powersrc.trim();
    }
}