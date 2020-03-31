package com.accp.vo.fcl;

import java.util.ArrayList;
import java.util.List;

import com.accp.pojo.Power;

public class FclPowerVo extends Power{
		private List<FclPowerVo> list=new ArrayList<FclPowerVo>(0);

		
		public List<FclPowerVo> getList() {
			return list;
		}

		public void setList(List<FclPowerVo> list) {
			this.list = list;
		}

		public FclPowerVo(Integer powerid, String powername, Integer powerparent, String powersrc,List<FclPowerVo> list) {
			super(powerid, powername, powerparent, powersrc);
			this.list = list;
		}
		
		public FclPowerVo() {
			// TODO Auto-generated constructor stub
		}
}
