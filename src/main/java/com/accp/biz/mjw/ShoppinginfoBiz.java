package com.accp.biz.mjw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.mjw.ShoppinginfoDao;
import com.accp.pojo.Shoppinginfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ShoppinginfoBiz {
	
	@Autowired
	private ShoppinginfoDao dao;
	
	public PageInfo<Shoppinginfo> pageInfo(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<Shoppinginfo>(dao.selectList(null));
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteById(int id) {
		return dao.deleteById(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertOne(Shoppinginfo entity) {
		return dao.insert(entity);
	}


}
