package com.accp.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Servicingcourse {
	
	@TableId(type = IdType.AUTO,value = "courseid")
    private Integer courseid;

    private String smid;

    private Date coursestarttime;

    private Date courseendtime;

    private Integer coursestate;

    private String coursemark;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid == null ? null : smid.trim();
    }

    public Date getCoursestarttime() {
        return coursestarttime;
    }

    public void setCoursestarttime(Date coursestarttime) {
        this.coursestarttime = coursestarttime;
    }

    public Date getCourseendtime() {
        return courseendtime;
    }

    public void setCourseendtime(Date courseendtime) {
        this.courseendtime = courseendtime;
    }

    public Integer getCoursestate() {
        return coursestate;
    }

    public void setCoursestate(Integer coursestate) {
        this.coursestate = coursestate;
    }

    public String getCoursemark() {
        return coursemark;
    }

    public void setCoursemark(String coursemark) {
        this.coursemark = coursemark == null ? null : coursemark.trim();
    }
    public Servicingcourse() {
		// TODO Auto-generated constructor stub
	}

	public Servicingcourse(Integer courseid, String smid, Date coursestarttime, Date courseendtime, Integer coursestate,
			String coursemark) {
		super();
		this.courseid = courseid;
		this.smid = smid;
		this.coursestarttime = coursestarttime;
		this.courseendtime = courseendtime;
		this.coursestate = coursestate;
		this.coursemark = coursemark;
	}
    
}