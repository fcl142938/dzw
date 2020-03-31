package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Material {
	
	@TableId(type = IdType.AUTO,value = "materialid")
    private Integer materialid;

    private String mlname;

    private String mladdress;

    private String mlphone;

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public String getMlname() {
        return mlname;
    }

    public void setMlname(String mlname) {
        this.mlname = mlname == null ? null : mlname.trim();
    }

    public String getMladdress() {
        return mladdress;
    }

    public void setMladdress(String mladdress) {
        this.mladdress = mladdress == null ? null : mladdress.trim();
    }

    public String getMlphone() {
        return mlphone;
    }

    public void setMlphone(String mlphone) {
        this.mlphone = mlphone == null ? null : mlphone.trim();
    }
}