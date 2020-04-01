package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfShiquDao;
import com.accp.pojo.Addressinfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfShiquBiz {
	@Autowired
	private LyfShiquDao lyfshiqudao;
	public List<Addressinfo> shiqu(String id) {
		QueryWrapper<Addressinfo> qw=Wrappers.query();
		qw.eq("provinceId",id);
		return lyfshiqudao.selectList(qw);
	}
}
