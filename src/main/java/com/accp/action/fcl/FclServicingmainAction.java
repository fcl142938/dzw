package com.accp.action.fcl;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclServicingmainBiz;
import com.accp.vo.fcl.FclServicingmainVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("fcl/api/sermain")
public class FclServicingmainAction {
	
	@Resource
	private FclServicingmainBiz biz;
	
	@GetMapping("queryPage/{currentPage}/{pageSize}/{state}")
	public PageInfo<FclServicingmainVo> queryPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize, @PathVariable Integer state ){
		return biz.queryPage(state, currentPage, pageSize);
	}
}
