package com.accp.biz.mjw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.mjw.MaterialDao;
import com.accp.pojo.Material;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class MaterialBiz {
	@Autowired
	private MaterialDao dao;
	
	
	public List<Material> selectMladdressList() {
		QueryWrapper<Material> qw = Wrappers.query();
		qw.select("distinct mladdress");
		
		return dao.selectList(qw);
	}
	
	
	public List<Material> select(String mladdress) {
		QueryWrapper<Material> qw = Wrappers.query();
		qw.eq("mladdress",mladdress);
		
		return dao.selectList(qw);
	}
	
	public PageInfo<Material> selectlist(String mladdress,int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		QueryWrapper<Material> qw = Wrappers.query();
		qw.eq("mladdress",mladdress);
		
		return new PageInfo<Material>(dao.selectList(qw));
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertOne(Material entity) {
		return dao.insert(entity);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteById(int id) {
		return dao.deleteById(id);
	}
	
	

	

}
