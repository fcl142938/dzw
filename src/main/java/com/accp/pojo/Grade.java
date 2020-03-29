package com.accp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Grade {
	
	@TableId(type = IdType.AUTO,value = "gradeid")
    private Integer gradeid;

    private String gradename;

    private Long gradeagio;

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename == null ? null : gradename.trim();
    }

    public Long getGradeagio() {
        return gradeagio;
    }

    public void setGradeagio(Long gradeagio) {
        this.gradeagio = gradeagio;
    }
}