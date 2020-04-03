package com.accp.action.fcl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclTypeBiz;
import com.accp.pojo.Typeinfo;
import com.accp.vo.fcl.FclTypeVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("fcl/api/type")
public class FclTypeAction {
	
	@Resource
	private FclTypeBiz biz;
	
	@GetMapping
	public List<FclTypeVo> queryType() {
		return biz.queryType();
	}
	
	@GetMapping("queryPage/{currentPage}/{pageSize}/{parentid}")
	public  PageInfo<Typeinfo>  queryPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize,@PathVariable Integer parentid){
		return biz.queryPage(currentPage, pageSize, parentid);
	}
}
