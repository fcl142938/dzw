package com.accp.pojo;

public class Consumerinfo {
    private Integer userid;

    private String username;

    private String userphone;

    private String useraddress;

    private String userbrithday;

    private String userremark;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserbrithday() {
        return userbrithday;
    }

    public void setUserbrithday(String userbrithday) {
        this.userbrithday = userbrithday == null ? null : userbrithday.trim();
    }

    public String getUserremark() {
        return userremark;
    }

    public void setUserremark(String userremark) {
        this.userremark = userremark == null ? null : userremark.trim();
    }
}