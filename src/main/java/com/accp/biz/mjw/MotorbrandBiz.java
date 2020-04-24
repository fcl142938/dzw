package com.accp.biz.mjw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.mjw.MotorbrandDao;
import com.accp.pojo.Motorbrand;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class MotorbrandBiz {
	
	@Autowired
	private MotorbrandDao dao;
	
	public PageInfo<Motorbrand> selectList() {
		//int pageNum,int pageSize
	//	PageHelper.startPage(pageNum, pageSize);

		return new PageInfo<Motorbrand>(dao.selectList(null));
	}
	
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertOne(Motorbrand entity) {
		return dao.insert(entity);
	}
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
public int updateById(Motorbrand entity) {
	return dao.updateById(entity);
}

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
public int deleteById(int id) {
	return dao.deleteById(id);
}


}
