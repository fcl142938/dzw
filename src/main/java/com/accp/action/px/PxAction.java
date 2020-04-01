package com.accp.action.px;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.px.PxBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Staff;
import com.accp.vo.px.PX;

@RestController
@RequestMapping("px/api/user")
public class PxAction {
	@Autowired
	private PxBiz pbiz;
	
	//员工信息搜索与查询
	@GetMapping("{staffname}")
	private List<PX> queryall(@PathVariable String staffname){
		
		if("null".equals(staffname)) {
			staffname=null;
		}
		return pbiz.queryall(staffname);
	}
	//员工部门查询
	@GetMapping("dep")
	public List<Department> query(){
		return  pbiz.query();
	}
	//员工资料新增
	 @PostMapping("addsta")
	public Map<String, String> addstaff(@RequestBody Staff sta) {
		 
		  pbiz.addstaff(sta);
		 Map<String, String> message = new HashMap<String, String>();
		 message.put("code", "200");
		 message.put("msg", "ok");
		 return message;
	}
	    //根据员工id查询员工信息
	 @GetMapping("sta/{staffid}")
		public Staff querybystaffid(@PathVariable Integer staffid) {
			return pbiz.querybystaffid(staffid) ;
		}
	 
	//根据员工id修改员工信息
	 @PutMapping("sta")
	 public Map<String, String> updatebystaffid(@RequestBody Staff sta) {
			pbiz.updatebystaffid(sta);
			 Map<String, String> message = new HashMap<String, String>();
			 message.put("code", "200");
			 message.put("msg", "ok");
			 return message;
		}
	 //根据员工id删除员工信息
	 @DeleteMapping("sta/{staffid}")
	 public Map<String, String> deletebystaffid(@PathVariable Integer staffid) {
			pbiz.deletebystaffid(staffid);
			 Map<String, String> message = new HashMap<String, String>();
			 message.put("code", "200");
			 message.put("msg", "ok");
			 return message;
		}
	 

}
