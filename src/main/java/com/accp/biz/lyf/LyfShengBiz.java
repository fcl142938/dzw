package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfShengDao;
import com.accp.pojo.Province;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfShengBiz {
	@Autowired
	private LyfShengDao lyfshengdao;
	public List<Province> sheng() {
		return lyfshengdao.selectList(null);
	}
}
