package com.accp.biz.fcl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.fcl.FclDepartmentDao;
import com.accp.dao.fcl.FclPositionDao;
import com.accp.vo.fcl.FclDepartmentVo;
import com.accp.pojo.Position;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@Service
public class FclDepartmentBiz {

	@Resource
	private FclPositionDao pdao;
	
	@Resource
	private FclDepartmentDao dao;
	
	/**
	 * 获取部门节点树
	 * @return
	 */
	public  List<FclDepartmentVo> departmentAll(){
		List<FclDepartmentVo> list=new ArrayList<FclDepartmentVo>(0);
		dao.selectList(null).forEach(temp->{
			FclDepartmentVo vo= new FclDepartmentVo();
			vo.setDepartmentid(temp.getDepartmentid());
			vo.setPositionname(temp.getDepartmentname());
			vo.setList(pdao.selectList(new QueryWrapper<Position>().eq("departmentid", temp.getDepartmentid())));
			list.add(vo);
		});
		return list;
	}
}
