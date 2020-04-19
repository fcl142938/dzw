package com.accp.action.tyh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tyh.tyhMemberBiz;
import com.accp.pojo.Grade;
import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.vo.tyh.Members;
import com.accp.vo.tyh.tyhMemberInfo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("tyh/api/m")
public class tyhMemberAction {
	
	@Autowired
	private tyhMemberBiz biz;
	
	/**
	 *  根据会员ID查询会员消费记录
	 * @param memberid
	 * @return
	 */
	@GetMapping("/tyhQueryByMemberinfo/{memberid}")
	public List<tyhMemberInfo> tyhQueryByMemberinfo(@PathVariable Integer memberid){
		return biz.tyhQueryByMemberinfo(memberid);
	}
	
	/**
	 *  查询会员等级 
	 * @return
	 */
	@GetMapping("/tyhQueryByGrade")
	public List<Grade> tyhQueryByGrade(){
		return biz.tyhQueryByGrade();
	}
	
	/**
	 * 新增会员
	 * @param m
	 * @return
	 */
	@PostMapping("/tyhInsertByMember")
	public Map<String, Object> tyhInsertByMember(@RequestBody Member m) {
		Map<String, Object> message = new HashMap<String, Object>();
		int i = biz.tyhInsertByMember(m);
		if(i > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 查询会员
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Members> tyhQueryByMember(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
		return biz.tyhQueryByMember(pageNum, pageSize);
	}

}
