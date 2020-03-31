package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Power;
import com.accp.pojo.Staff;

public class FclStaffVo {
	private Staff stf;
	
	private List<Power>  list= new ArrayList<Power>(0);
	
	

	public Staff getStf() {
		return stf;
	}

	public void setStf(Staff stf) {
		this.stf = stf;
	}

	public List<Power> getList() {
		return list;
	}

	public void setList(List<Power> list) {
		this.list = list;
	}
	
}
