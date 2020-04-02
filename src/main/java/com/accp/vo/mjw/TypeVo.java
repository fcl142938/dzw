package com.accp.vo.mjw;

import java.util.List;

import com.accp.pojo.Type;

public class TypeVo {
	  private Integer typeid;

	    private String typename;

	    private Integer typeparent;
	    
	    private List<Type> typeList;

	    public List<Type> getTypeList() {
			return typeList;
		}

		public void setTypeList(List<Type> typeList) {
			this.typeList = typeList;
		}

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
	        this.typename = typename == null ? null : typename.trim();
	    }

	    public Integer getTypeparent() {
	        return typeparent;
	    }

	    public void setTypeparent(Integer typeparent) {
	        this.typeparent = typeparent;
	    }
}
