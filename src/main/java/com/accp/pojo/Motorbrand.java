package com.accp.pojo;

public class Motorbrand {
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