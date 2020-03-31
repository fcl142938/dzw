package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Motorbrand {
	
	@TableId(type = IdType.AUTO,value = "motorid")
    private Integer motorid;

    private String motorname;

    private String motorletter;

    public Integer getMotorid() {
        return motorid;
    }

    public void setMotorid(Integer motorid) {
        this.motorid = motorid;
    }

    public String getMotorname() {
        return motorname;
    }

    public void setMotorname(String motorname) {
        this.motorname = motorname == null ? null : motorname.trim();
    }

    public String getMotorletter() {
        return motorletter;
    }

    public void setMotorletter(String motorletter) {
        this.motorletter = motorletter == null ? null : motorletter.trim();
    }
}