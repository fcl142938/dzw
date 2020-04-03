package com.accp.vo.tyh;

public class PositionAndDepartment {
	private Integer positionid;
    private Integer departmentid;
    private String positionname;
    private String departmentname;
    
    
	@Override
	public String toString() {
		return "PositionAndDepartment [positionid=" + positionid + ", departmentid=" + departmentid + ", positionname="
				+ positionname + ", departmentname=" + departmentname + "]";
	}

	public PositionAndDepartment(Integer positionid, Integer departmentid, String positionname, String departmentname) {
		super();
		this.positionid = positionid;
		this.departmentid = departmentid;
		this.positionname = positionname;
		this.departmentname = departmentname;
	}
	
	public PositionAndDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getPositionid() {
		return positionid;
	}
	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}
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
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
    
}
