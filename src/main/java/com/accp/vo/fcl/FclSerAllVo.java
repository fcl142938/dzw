package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Artificergrow;
import com.accp.pojo.Consumercar;
import com.accp.pojo.Rescuecar;

public class FclSerAllVo {
	private List<Rescuecar> rlist= new ArrayList<Rescuecar>(0);
	
	private List<Artificergrow> alist= new ArrayList<Artificergrow>(0);
	
	private List<Consumercar> clist= new ArrayList<Consumercar>(0);

	public List<Rescuecar> getRlist() {
		return rlist;
	}

	public void setRlist(List<Rescuecar> rlist) {
		this.rlist = rlist;
	}

	public List<Artificergrow> getAlist() {
		return alist;
	}

	public void setAlist(List<Artificergrow> alist) {
		this.alist = alist;
	}

	public List<Consumercar> getClist() {
		return clist;
	}

	public void setClist(List<Consumercar> clist) {
		this.clist = clist;
	}

	public FclSerAllVo() {
		// TODO Auto-generated constructor stub
	}

	public FclSerAllVo(List<Rescuecar> rlist, List<Artificergrow> alist, List<Consumercar> clist) {
		super();
		this.rlist = rlist;
		this.alist = alist;
		this.clist = clist;
	}
	
	
	
	
}
