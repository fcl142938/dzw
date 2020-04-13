package com.accp.biz.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tyh.tyhIMemberDAO;
import com.accp.pojo.Member;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class tyhMemberBiz {
	
	@Autowired
	private tyhIMemberDAO dao;
	
	/* 新增会员 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhInsertByMember(Member m) {
		return dao.tyhInsertByMember(m);
	}
	
	/* 查询会员 */
	public PageInfo<Member> tyhQueryByMember(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Member>(dao.tyhQueryByMember());
	}

}