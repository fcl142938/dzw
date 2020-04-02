package com.accp.action.fcl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclPowerBiz;
import com.accp.vo.fcl.FclPowerUpVo;

@RestController
@RequestMapping("fcl/api/power")
public class FclPowerAction {
		
	@Resource
	private FclPowerBiz biz;
	
	@PostMapping("modifyPower")//
	public  String modifyPower(@RequestBody FclPowerUpVo vo) {
		System.out.println(vo.getList());
		biz.modifyPower(vo);
		return "ok";
	}
	
}
