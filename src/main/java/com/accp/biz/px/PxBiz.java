package com.accp.biz.px;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.px.PxDao;
import com.accp.dao.px.PxdepartmentDao;
import com.accp.dao.px.PxstaffDao;
import com.accp.pojo.Department;
import com.accp.pojo.Staff;
import com.accp.vo.px.PX;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PxBiz {
	@Autowired
	private PxDao pdao;
	
	@Autowired
	private PxdepartmentDao ddao;
	
	@Autowired
	private PxstaffDao sdao;
	
	//员工信息查询与搜索
	public List<PX> queryall(String staffname){
		return pdao.queryall(staffname);
	}
	
	//部门查询
	public List<Department> query(){
		return  ddao.selectList(null);
	}
	//员工新增
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addstaff(Staff sta) {
		 return sdao.insert(sta);
	}
	//根据员工id查询员工信息
	public Staff querybystaffid(Integer staffid) {
		return sdao.selectById(staffid);
	}
	//根据员工id删除员工信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deletebystaffid(Integer staffid) {
		return sdao.deleteById(staffid);
	}
	
	//根据员工id修改员工信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updatebystaffid(Staff sta) {
		return sdao.updateById(sta);
	}
	

}
