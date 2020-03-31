package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfKhzlDao;
import com.accp.pojo.Consumerinfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfKhzlBiz {
	@Autowired
	private LyfKhzlDao lyfkhzldao;
	public List<Consumerinfo> khzl() {
		return lyfkhzldao.selectList(null);
	}
}
