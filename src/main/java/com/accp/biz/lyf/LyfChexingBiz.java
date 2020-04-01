package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfChexingDao;
import com.accp.pojo.Motorcycle;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfChexingBiz {
	@Autowired
	private LyfChexingDao lyfchexingdao;
	public List<Motorcycle> chexing(String id) {
		QueryWrapper<Motorcycle> qw=Wrappers.query();
		qw.eq("brandid",id);
		return lyfchexingdao.selectList(qw);
	}
}
