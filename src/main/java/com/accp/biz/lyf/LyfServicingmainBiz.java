package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfServicingmainDao;
import com.accp.vo.lyf.LyfWxjlVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfServicingmainBiz {
	@Autowired
	private LyfServicingmainDao lyfservicingmaindao;
	public List<LyfWxjlVo> wxjl(Integer consumerid) {
		return lyfservicingmaindao.wxjl(consumerid);
	}
}
