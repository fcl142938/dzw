package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfKhzlDao;
import com.accp.pojo.Consumerinfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfKhzlBiz {
	@Autowired
	private LyfKhzlDao lyfkhzldao;
	public List<Consumerinfo> khzl(String tiaojian) {
		if(tiaojian.equals("null")) {
			return lyfkhzldao.selectList(null);
		}else {
			QueryWrapper<Consumerinfo> qw=Wrappers.query();
			qw.like("userid",tiaojian).or().like("username", tiaojian).or().like("userphone",tiaojian);
			return lyfkhzldao.selectList(qw);
		}
	}
	public int addkehu(Consumerinfo kehu) {
		return lyfkhzldao.insert(kehu);
	}
	public int xiugaikehu(Consumerinfo kehu) {
		return lyfkhzldao.updateById(kehu);
	}
	public int shanchukehu(String userid) {
		return lyfkhzldao.deleteById(userid);
	}
	public List<Consumerinfo> khzlid(String userid) {
		QueryWrapper<Consumerinfo> qw=Wrappers.query();
		qw.eq("userid", userid);
		return lyfkhzldao.selectList(qw);
	}
}
