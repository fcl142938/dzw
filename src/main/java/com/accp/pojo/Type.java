package com.accp.pojo;

public class Type {
    private Integer typeid;

    private String typename;

    private Integer typeparent;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypeparent() {
        return typeparent;
    }

    public void setTypeparent(Integer typeparent) {
        this.typeparent = typeparent;
    }
}