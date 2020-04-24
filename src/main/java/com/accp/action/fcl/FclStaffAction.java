package com.accp.action.fcl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclStaffBiz;
import com.accp.vo.fcl.FclPowerVo;
import com.accp.vo.fcl.FclStaffVo;

@RestController
@RequestMapping("/fcl/api/staff")
public class FclStaffAction {
		
	@Resource
	private FclStaffBiz biz;
	
	/**
	 * 登录
	 * @param username
	 * @param userpwd
	 * @return
	 */
	@GetMapping("login/{staffname}/{staffpwd}")
	public  Map<String, Object> login(@PathVariable String staffname,@PathVariable String staffpwd,HttpSession session) {
		FclStaffVo stfvo=biz.login(staffname,staffpwd);
		Map<String, Object> map= new HashMap<String, Object>();
		if(stfvo!=null&&stfvo.getStf().getState()==0) {
			session.setAttribute("stfvo", stfvo);
			map.put("state", 200);
			map.put("staff", stfvo);
		}else if(stfvo!=null&&stfvo.getStf().getState()==1){
			map.put("state", 300);
		}else {
			map.put("state", 400);
		}
		return map;
	}
	
	/**
	 * 获取权限
	 * @param session
	 * @return
	 */
	@GetMapping("power")
	public Object  getPower(HttpSession session) {
		FclStaffVo vo=(FclStaffVo)session.getAttribute("stfvo");
		if(vo!=null) {
			return vo;
		}
		return "no";
	}
	
	/**
	 * 退出
	 * @param session
	 */
	@GetMapping("extis")
	public String  extis(HttpSession session) {
		session.removeAttribute("stfvo");
		return "ok";
	}
	
	/**
	 * 获取所有权限
	 * @return
	 */
	@GetMapping("power/powerGet")
	public  List<FclPowerVo> powerGet(){
		return biz.powerGet();
	}
	
	@GetMapping("power/{positionid}")
	public  List<Integer> poweridGet(@PathVariable Integer positionid){
		return biz.poweridGet(positionid);
	}
}
