package com.accp.vo.lx;

public class LxArtificergradeVo {
	private Integer agid;
	private String agname;
	private Integer agprice;

	public Integer getAgid() {
		return agid;
	}

	public void setAgid(Integer agid) {
		this.agid = agid;
	}

	public String getAgname() {
		return agname;
	}

	public LxArtificergradeVo() {
		super();
	}

	public LxArtificergradeVo(Integer agid, String agname, Integer agprice) {
		super();
		this.agid = agid;
		this.agname = agname;
		this.agprice = agprice;
	}

	@Override
	public String toString() {
		return "LxArtificergradeVo [agid=" + agid + ", agname=" + agname + ", agprice=" + agprice + "]";
	}

	public void setAgname(String agname) {
		this.agname = agname;
	}

	public Integer getAgprice() {
		return agprice;
	}

	public void setAgprice(Integer agprice) {
		this.agprice = agprice;
	}
}
