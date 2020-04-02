package com.accp.biz.mjw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.mjw.TypeInfoDao;
import com.accp.pojo.Typeinfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TypeInfoBiz {
	@Autowired
	private TypeInfoDao dao;
	
	public PageInfo<Typeinfo> selecTypeInfotList(int pageNum,int pageSize,int typeid) {
		PageHelper.startPage(pageNum, pageSize);
		
		QueryWrapper<Typeinfo> qw = Wrappers.query();
		qw.eq("typeid", typeid);
		 
		return new PageInfo<Typeinfo>(dao.selectList(qw));
	}
	
	public Typeinfo selectOne(int infoid) {
		
		
		QueryWrapper<Typeinfo> qw = Wrappers.query();
		qw.eq("infoid", infoid);
		 
		return dao.selectOne(qw);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateById(Typeinfo t) {
		
		
		
		 
		return dao.updateById(t);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertOne(Typeinfo t) {
		
		
		
		 
		return dao.insert(t);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteById(int id) {
		
		
		return dao.deleteById(id);
		 
		
	}
	
}
