package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Position;

public class FclDepartmentVo  {
	
	 private Integer departmentid;

	 private String positionname;
	
	private List<Position> list = new ArrayList<Position>(0);
	

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getPositionname() {
		return positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	public List<Position> getList() {
		return list;
	}

	public void setList(List<Position> list) {
		this.list = list;
	}

}
