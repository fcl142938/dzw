package com.accp.biz.tyh;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tyh.tyhISettlementCenterDAO;
import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.vo.tyh.MemberInfos;
import com.accp.vo.tyh.SettlementCenter;
import com.accp.vo.tyh.tyhParticulars;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class tyhSettlementCenterBiz {
	
	@Autowired
	private tyhISettlementCenterDAO dao;
	
	/* 维修项目 */
	public List<tyhParticulars> tyhQueryByXm(Integer infoid){
		return dao.tyhQueryByXm(infoid);
	}
	
	/* 打开单据 */
	public tyhParticulars tyhQueryByXq(Integer smid) {
		return dao.tyhQueryByXq(smid);
	}
	
	//多条件查询
	public List<SettlementCenter> queryByMaxSettlementCenter(String state,String smid, String carnumber, String username, String staffname, String userremark,String starttime, String entime){
		return dao.queryByMaxSettlementCenter(state, smid, carnumber, username, staffname, userremark, starttime, entime);
	}
	
	//回滚
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhupdateByHgSettlementCenter(Integer smid) {
		return dao.tyhupdateByHgSettlementCenter(smid);
	}
	
	//修改会员消费金额/余额
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhUpdateByMoIntegral(Memberinfo mo) {
		return dao.tyhUpdateByMoIntegral(mo);
	}
	
	//修改会员积分/余额
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhUpdateByMIntegral(Member m) {
		return dao.tyhUpdateByMIntegral(m);
	}
	
	//新增会员消费记录
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int tyhInsertByJl(MemberInfos m) {
		return dao.tyhInsertByJl(m);
	}
	
	//根据登录会员查询ID
	public Member tyhQueryByHyName(String membername) {
		return dao.tyhQueryByHyName(membername);
	}
	
	//登录会员
	public Member tyhloginHy(String membername,String memberpwd) {
		return dao.tyhloginHy(membername, memberpwd);
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
