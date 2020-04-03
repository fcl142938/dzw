package com.accp.biz.tyh;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tyh.tyhIpositionDAO;
import com.accp.pojo.Position;
import com.accp.vo.tyh.PositionAndDepartment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class tyhPositionBiz {
	
	@Autowired
	private tyhIpositionDAO dao;
	
	/* 删除岗位 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhDelPositionById(Integer positionid) {
		return dao.tyhDelPositionById(positionid);
	}
	
	/* 修改岗位 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhUpdateByPosition(Position p) {
		return dao.tyhUpdateByPosition(p);
	}
	
	/* 新增岗位 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhinsertByPosition(Position p) {
		return dao.tyhinsertByPosition(p);
	}
	
	/* 根据岗位ID查询岗位ID是否存在 */
	public int tyhQueryByPositionId(Integer positionid) {
		return dao.tyhQueryByPositionId(positionid);
	}

	/* 查询所有岗位 */
	public PageInfo<PositionAndDepartment> tyhQueryByPositionAll(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<PositionAndDepartment>(dao.tyhQueryByPositionAll());
	}
	
	
}
