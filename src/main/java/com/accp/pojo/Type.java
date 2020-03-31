package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Type")
public class Type {
	
	@TableId(type = IdType.AUTO,value = "typeid")
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