package com.accp.action.fcl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclDepartmentBiz;
import com.accp.vo.fcl.FclDepartmentVo;

@RestController
@RequestMapping("fcl/api/department")
public class FclDepartmentAction {
	
	@Resource
	private FclDepartmentBiz biz;
	
	/**
	 * 获取部门节点树
	 * @return
	 */
	@GetMapping
	public List<FclDepartmentVo> departmentAll(){
		return biz.departmentAll();
	}

}
