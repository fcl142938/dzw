package com.accp.action.px;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.px.PxBiz;
import com.accp.vo.px.PX;

@RestController
@RequestMapping("px/api/user")
public class PxAction {
	@Autowired
	private PxBiz pbiz;
	
	@GetMapping("{staffname}")
	private List<PX> queryall(@PathVariable String staffname){
		System.out.println(staffname);
		if("null".equals(staffname)) {
			staffname=null;
		}
		return pbiz.queryall(staffname);
	}

}
