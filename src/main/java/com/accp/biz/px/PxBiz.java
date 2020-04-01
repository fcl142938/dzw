package com.accp.biz.px;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.px.PxDao;
import com.accp.vo.px.PX;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PxBiz {
	@Autowired
	private PxDao pdao;
	
	public List<PX> queryall(String staffname){
		return pdao.queryall(staffname);
	}
	

}
