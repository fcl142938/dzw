package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Servicinginfo {
	@TableId(type = IdType.AUTO,value = "siid")
    private Integer siid;

    private String smid;

    private Integer infoid;
    
    private String infoname;
    private Double price;
    private String infomark;
    private Integer courseid;
    
    private Double infotime;
    

    public Double getInfotime() {
		return infotime;
	}

	public void setInfotime(Double infotime) {
		this.infotime = infotime;
	}
    
    

	
    public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getInfoname() {
		return infoname;
	}

	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getInfomark() {
		return infomark;
	}

	public void setInfomark(String infomark) {
		this.infomark = infomark;
	}

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
    
    public Servicinginfo() {
		// TODO Auto-generated constructor stub
	}

	public Servicinginfo(String smid, Integer infoid, String infoname, Double price, String infomark,
			Integer courseid) {
		super();
		this.smid = smid;
		this.infoid = infoid;
		this.infoname = infoname;
		this.price = price;
		this.infomark = infomark;
		this.courseid = courseid;
	}
    
}