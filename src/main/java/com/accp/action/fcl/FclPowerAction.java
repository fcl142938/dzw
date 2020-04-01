package com.accp.action.fcl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclPowerBiz;

@RestController
@RequestMapping("fcl/api/power")
public class FclPowerAction {
		
	@Resource
	private FclPowerBiz biz;
	
	@PostMapping("modifyPower")//Integer positionid,
	public  String modifyPower(@RequestBody List<String> list) {
		System.out.println(list);
		System.out.println("");
		//biz.modifyPower(positionid, list);
		return "ok";
	}
	
}
