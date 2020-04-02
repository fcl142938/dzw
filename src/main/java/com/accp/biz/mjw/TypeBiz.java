package com.accp.biz.mjw;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.mjw.TypeDao;
import com.accp.pojo.Type;
import com.accp.vo.mjw.TypeVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TypeBiz {
	@Autowired
	private TypeDao dao;
	
	public List<TypeVo> selectList(int num) {
		QueryWrapper<Type> qw = Wrappers.query();
		qw.eq("typeparent", num); 
		List<TypeVo> list =  new ArrayList<TypeVo>();
		dao.selectList(qw).forEach(val ->{
			TypeVo tvo = new TypeVo();
			tvo.setTypeid(val.getTypeid()); 
			tvo.setTypename(val.getTypename());
			tvo.setTypeparent(val.getTypeparent());
			QueryWrapper<Type> qw2 = Wrappers.query();
			qw2.eq("typeparent", val.getTypeid());
			tvo.setTypeList(dao.selectList(qw2));
			list.add(tvo);
		});
		
		return list;
	}
}
