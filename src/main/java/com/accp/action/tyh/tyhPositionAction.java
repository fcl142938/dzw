package com.accp.action.tyh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tyh.tyhPositionBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Position;
import com.accp.vo.tyh.PositionAndDepartment;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("tyh/api/p")
public class tyhPositionAction {
	
	@Autowired
	private tyhPositionBiz biz;
	
	/**
	 *  查询部门 
	 * @return
	 */
	@GetMapping("/tyhQueryByDepartment")
	public List<Department> tyhQueryByDepartment(){
		return biz.tyhQueryByDepartment();
	}
	
	/**
	 *  删除岗位 
	 * @param positionid
	 * @return
	 */
	@DeleteMapping("/tyhDelPositionById/{positionid}")
	public Map<String, Object> tyhDelPositionById(@PathVariable Integer positionid) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.tyhDelPositionById(positionid);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/* 修改岗位 */
	@PutMapping("/tyhUpdateByPosition")
	public Map<String, Object> tyhUpdateByPosition(@RequestBody Position p) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.tyhUpdateByPosition(p);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/* 新增岗位 */
	@PostMapping("/tyhinsertByPosition")
	public Map<String, Object> tyhinsertByPosition(@RequestBody Position p) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.tyhinsertByPosition(p);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}

	/**
	 *  根据岗位ID查询岗位ID是否存在 
	 * @param positionid
	 * @return
	 */
	@GetMapping("/tyhQueryByPositionId/{positionid}")
	public Map<String, Object> tyhQueryByPositionId(@PathVariable Integer positionid) {
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhQueryByPositionId(positionid) != null) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 *  查询所有岗位 
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<PositionAndDepartment> tyhQueryByPositionAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize) {
		return biz.tyhQueryByPositionAll(pageNum, pageSize);
	}

}
