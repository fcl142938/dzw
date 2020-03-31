package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Power;
import com.accp.pojo.Staff;

public class FclStaffVo {
	private Staff stf;
	
	private List<FclPowerVo>  list= new ArrayList<FclPowerVo>(0);
	
	

	public Staff getStf() {
		return stf;
	}

	public void setStf(Staff stf) {
		this.stf = stf;
	}

	public List<FclPowerVo> getList() {
		return list;
	}

	public void setList(List<FclPowerVo> list) {
		this.list = list;
	}
	
}
