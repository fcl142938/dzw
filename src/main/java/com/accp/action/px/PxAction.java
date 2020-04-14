package com.accp.action.px;

import java.util.Date;
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
import com.accp.pojo.Position;
import com.accp.pojo.Staff;
import com.accp.vo.px.PX;
import com.accp.vo.px.Pxdep;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("px/api/user")
public class PxAction {
	@Autowired
	private PxBiz pbiz;
	
	//员工信息搜索与查询
	@GetMapping("{staffname}/{pageNum}/{pageSize}")
	private PageInfo<PX> queryall(@PathVariable String staffname,@PathVariable Integer pageNum, @PathVariable Integer pageSize){
		
		if("null".equals(staffname)) {
			staffname=null;
			
			
			
		}
		return pbiz.queryall(staffname, pageNum,pageSize);
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
	 //部门新增
	 @PostMapping("adddepment")
	 public Map<String, String> adddeps(@RequestBody Department d) {
		 pbiz.adddeps(d);
		 Map<String, String> message = new HashMap<String, String>();
		 message.put("code", "200");
		 message.put("msg", "ok");
		 return message;
	 }
	 //部门删除
	 @DeleteMapping("deletedepss/{departmentid}")
	 public Map<String, String> deletedeps(@PathVariable Integer departmentid) {
		 System.out.println(departmentid);
		 pbiz.deletedeps(departmentid);
		 Map<String, String> message = new HashMap<String, String>();
		 message.put("code", "200");
		 message.put("msg", "ok");
		 return message;
	 }
	 //根据Id查询部门
	 @GetMapping("depment/{departmentid}")
	 public Department querybyid(@PathVariable  Integer departmentid) {
			return pbiz.querybyid(departmentid);
		}
	 //修改部门名称
	  @PutMapping("modifdep") 
	public Map<String, String> updatedeps(@RequestBody Department d) {
			  pbiz.updatedeps(d);
			  Map<String, String> message = new HashMap<String, String>();
				 message.put("code", "200");
				 message.put("msg", "ok");
				 return message;
	  
	}
	  //根据部门id查询职位
	  @GetMapping("{departmentid}")
	  public List<Position> querybydepid(@PathVariable Integer departmentid){
		  return pbiz.querybydepid(departmentid);
	  }
	  //员工离职查询
		@GetMapping("leave/{staffname}/{pageNum}/{pageSize}")
		private PageInfo<PX> queryleave(@PathVariable String staffname,@PathVariable Integer pageNum, @PathVariable Integer pageSize){
			if("null".equals(staffname)) {
				staffname=null;
			}
			return pbiz.queryleave(staffname, pageNum,pageSize);
		}
		//员工姓名
		@GetMapping("queryname")
		public List<PX> queryname(){
			return pbiz.queryname();
		}
		//员工离职
		@PostMapping("updateleave/{sendtime}/{staffname}") 
		public Map<String, String> updatestaff(@PathVariable String sendtime,@PathVariable String staffname ) {
			pbiz.updatestaff(sendtime, staffname);
			  Map<String, String> message = new HashMap<String, String>();
				 message.put("code", "200");
				 message.put("msg", "ok");
				 return message;
			
		}
		
		//员工回滚
			@PostMapping("updateleaveinfo/{staffname}") 
				public Map<String, String> updatestaffinfo(@PathVariable String staffname ) {
					pbiz.updatestaffinfo( staffname);
					  Map<String, String> message = new HashMap<String, String>();
						 message.put("code", "200");
						 message.put("msg", "ok");
						 return message;
					
				}
	 
	 

}
