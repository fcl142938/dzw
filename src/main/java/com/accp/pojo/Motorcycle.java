package com.accp.pojo;

public class Motorcycle {
    private Integer motorcycleid;

    private Integer motorid;

    private String motorcyclename;

    private Long motorcycleprice;

    public Integer getMotorcycleid() {
        return motorcycleid;
    }

    public void setMotorcycleid(Integer motorcycleid) {
        this.motorcycleid = motorcycleid;
    }

    public Integer getMotorid() {
        return motorid;
    }

    public void setMotorid(Integer motorid) {
        this.motorid = motorid;
    }

    public String getMotorcyclename() {
        return motorcyclename;
    }

    public void setMotorcyclename(String motorcyclename) {
        this.motorcyclename = motorcyclename == null ? null : motorcyclename.trim();
    }

    public Long getMotorcycleprice() {
        return motorcycleprice;
    }

    public void setMotorcycleprice(Long motorcycleprice) {
        this.motorcycleprice = motorcycleprice;
    }
}