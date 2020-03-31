package com.accp.action.fcl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclStaffBiz;
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
		if(stfvo!=null) {
			session.setAttribute("stfvo", stfvo);
			map.put("state", 200);
			map.put("staff", stfvo);
		}else {
			map.put("state", 400);
		}
		return map;
	}
}
