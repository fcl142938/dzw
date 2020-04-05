package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Servicingcourse;
import com.accp.pojo.Servicinginfo;
import com.accp.pojo.Servicingmain;
import com.accp.pojo.Typeinfo;

public class FclServicingmainVo {
	
	private  Servicingmain ser;
	
	private String name;
	
	private String gname;
	
	//项目
	private List<Servicinginfo> list=new ArrayList<Servicinginfo>(0);
	
	
	//检验过程
	private List<Servicingcourse> slist= new ArrayList<Servicingcourse>(0);
	
	

	public List<Servicingcourse> getSlist() {
		return slist;
	}

	public void setSlist(List<Servicingcourse> slist) {
		this.slist = slist;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
