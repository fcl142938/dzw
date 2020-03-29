package com.accp.pojo;

public class Rescuecar {
    private Integer rescueid;

    private String rescuenumber;

    private String renumber;

    private Integer state;

    public Integer getRescueid() {
        return rescueid;
    }

    public void setRescueid(Integer rescueid) {
        this.rescueid = rescueid;
    }

    public String getRescuenumber() {
        return rescuenumber;
    }

    public void setRescuenumber(String rescuenumber) {
        this.rescuenumber = rescuenumber == null ? null : rescuenumber.trim();
    }

    public String getRenumber() {
        return renumber;
    }

    public void setRenumber(String renumber) {
        this.renumber = renumber == null ? null : renumber.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}