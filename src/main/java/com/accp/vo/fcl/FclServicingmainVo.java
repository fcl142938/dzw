package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Servicingmain;
import com.accp.pojo.Typeinfo;

public class FclServicingmainVo {
	
	private  Servicingmain ser;
	
	private List<Typeinfo> list=new ArrayList<Typeinfo>(0);

	public Servicingmain getSer() {
		return ser;
	}

	public void setSer(Servicingmain ser) {
		this.ser = ser;
	}

	public List<Typeinfo> getList() {
		return list;
	}

	public void setList(List<Typeinfo> list) {
		this.list = list;
	}
	
}
