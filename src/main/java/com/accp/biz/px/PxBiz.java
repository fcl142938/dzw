package com.accp.biz.px;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.px.PxDao;
import com.accp.dao.px.PxdepDao;
import com.accp.dao.px.PxdepartmentDao;
import com.accp.dao.px.PxstaffDao;
import com.accp.pojo.Department;
import com.accp.pojo.Position;
import com.accp.pojo.Staff;
import com.accp.vo.px.PX;
import com.accp.vo.px.Pxdep;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PxBiz {
	@Autowired
	private PxDao pdao;
	
	@Autowired
	private PxdepartmentDao ddao;
	
	@Autowired
	private PxstaffDao sdao;
	
	@Autowired
	private  PxdepDao xdao;
	
	//员工信息查询与搜索
	public PageInfo<PX> queryall(String staffname,Integer pageNum,Integer pageSize,String departmentname,String positionname){
		PageHelper.startPage(pageNum, pageSize);
		return  new PageInfo<PX>(pdao.queryall(staffname, departmentname, positionname));
	}
	
	//部门查询
	public List<Department> query(){
		return  ddao.selectList(null);
	}
	//员工新增
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addstaff(Staff sta) {
		List<Staff> list=sdao.selectList(new QueryWrapper<Staff>().eq("staffaccount", sta.getStaffaccount()));
			if(list!=null&&list.size()!=0) {
				return 0;
			}
		 return sdao.insert(sta);
	}
	//员工职位查询
	public List<Position> selectposition(){
		return pdao.selectposition();
	}
	//根据员工id查询员工信息
	public PX querybystaffid(Integer staffid) {
		return pdao.selectbystaffid(staffid);
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
	
    //部门新增
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int adddeps(Department d) {
		return ddao.insert(d);
	}
	
	//部门修改
		@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public int updatedeps(Department d) {
			return ddao.updateById(d);
		}
		//部门删除
		@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public int deletedeps(Integer departmentid) {
			return ddao.deleteById(departmentid);
		}
		//根据部门id查询部门
		public Department querybyid(Integer departmentid) {
			return ddao.selectById(departmentid);
		}
		//根据部门id查询职位
	public	List<Position> querybydepid(Integer departmentid){
			return ddao.querybydepid(departmentid);
		}
	//员工离职查询
	
	public PageInfo<PX> queryleave(String staffname,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return  new PageInfo<PX>(pdao.queryaleave(staffname));
	}
	//员工姓名查询
	public List<PX> queryname(){
		return pdao.queryname();
	}
	//员工离职
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updatestaff(String sendtime,String staffname ) {
		return pdao.updatestaff(sendtime, staffname);
	}
	
	//员工回滚
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updatestaffinfo(String staffname ) {
		return pdao.updatestaffinfo(staffname);
	}
	//查询部门下面是否有职位
	public List<Position> querybypos(Integer departmentid){
		return pdao.querybypos(departmentid);
	}
 
	

}
