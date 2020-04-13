package com.accp.biz.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tyh.tyhISettlementCenterDAO;
import com.accp.vo.tyh.SettlementCenter;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class tyhSettlementCenterBiz {
	
	@Autowired
	private tyhISettlementCenterDAO dao;
	
	//多条件查询
	public List<SettlementCenter> queryByMaxSettlementCenter(Integer state){
		return dao.queryByMaxSettlementCenter(state);
	}
	
	//回滚
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhupdateByHgSettlementCenter(Integer smid) {
		return dao.tyhupdateByHgSettlementCenter(smid);
	}
	
	//收银
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhupdateBySettlementCenter(Integer smid) {
		return dao.tyhupdateBySettlementCenter(smid);
	}
	
	//结算中心查看
	public List<SettlementCenter> queryBySettlementCenter(){
		return dao.queryBySettlementCenter();
	}
	
	
	
}
