package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Type;

public class FclTypeVo {

	 private Integer typeid;

	    private String typename;

	    private Integer typeparent;
	    
		private List<FclTypeVo> list= new ArrayList<FclTypeVo>(0);
		
		
		public Integer getTypeid() {
			return typeid;
		}
		public void setTypeid(Integer typeid) {
			this.typeid = typeid;
		}
		public String getTypename() {
			return typename;
		}
		public void setTypename(String typename) {
			this.typename = typename;
		}
		public Integer getTypeparent() {
			return typeparent;
		}
		public void setTypeparent(Integer typeparent) {
			this.typeparent = typeparent;
		}
		public List<FclTypeVo> getList() {
			return list;
		}
		public void setList(List<FclTypeVo> list) {
			this.list = list;
		}
		
		public FclTypeVo() {
			// TODO Auto-generated constructor stub
		}
		public FclTypeVo(Integer typeid, String typename, Integer typeparent, List<FclTypeVo> list) {
			super();
			this.typeid = typeid;
			this.typename = typename;
			this.typeparent = typeparent;
			this.list = list;
		}
		
		
}
