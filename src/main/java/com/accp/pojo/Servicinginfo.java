package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Servicinginfo {
	@TableId(type = IdType.AUTO,value = "siid")
    private Integer siid;

    private String smid;

    private Integer infoid;

    public Integer getSiid() {
        return siid;
    }

    public void setSiid(Integer siid) {
        this.siid = siid;
    }

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid == null ? null : smid.trim();
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }
}