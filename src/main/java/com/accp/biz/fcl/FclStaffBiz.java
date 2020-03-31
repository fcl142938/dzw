package com.accp.biz.fcl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclStaffDao;
import com.accp.pojo.Staff;
import com.accp.vo.fcl.FclStaffVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FclStaffBiz {
		
	//@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	@Resource
	private  FclStaffDao dao;
	
	//登录并获取权限
	public FclStaffVo login(String staffname,String staffpwd) {
		FclStaffVo svo= new FclStaffVo();
		QueryWrapper<Staff> qw=Wrappers.query();
		svo.setStf(dao.selectOne(qw.eq("staffname", staffname).eq("",staffpwd )));
	 System.out.println();;
		 return null;
	}
}
