package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfClzlDao;
import com.accp.pojo.Consumercar;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfClzlBiz {
	@Autowired
	private LyfClzlDao lyfclzldao;
	public List<Consumercar> clzl(String userid) {
		QueryWrapper<Consumercar> qw=Wrappers.query();
		qw.eq("userid", userid);
		return lyfclzldao.selectList(qw);
	}
}
