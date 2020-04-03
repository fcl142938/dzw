package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Servicinginfo;
import com.accp.pojo.Servicingmain;
import com.accp.pojo.Typeinfo;

public class FclServicingmainVo {
	
	private  Servicingmain ser;
	
	private List<Servicinginfo> list=new ArrayList<Servicinginfo>(0);

	public Servicingmain getSer() {
		return ser;
	}

	public void setSer(Servicingmain ser) {
		this.ser = ser;
	}

	public List<Servicinginfo> getList() {
		return list;
	}

	public void setList(List<Servicinginfo> list) {
		this.list = list;
	}
	
	
}
