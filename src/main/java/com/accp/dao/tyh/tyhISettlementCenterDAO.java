package com.accp.dao.tyh;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.vo.tyh.MemberInfos;
import com.accp.vo.tyh.SettlementCenter;
import com.accp.vo.tyh.tyhParticulars;

public interface tyhISettlementCenterDAO {
	
	
	
	/* 维修项目 */
	List<tyhParticulars> tyhQueryByXm(@Param("infoid") Integer infoid);
	
	/* 打开单据 */
	tyhParticulars tyhQueryByXq(@Param("smid") String smid);
	
	//多条件查询
	List<SettlementCenter> queryByMaxSettlementCenter(@Param("state") String state,@Param("smid") String smid,@Param("carnumber") String carnumber,@Param("username") String username,@Param("staffname") String staffname,@Param("userremark") String userremark,@Param("starttime") String starttime,@Param("entime") String entime);
	
	//回滚
	int tyhupdateByHgSettlementCenter(@Param("smid") String smid);
	
	//修改会员消费金额/余额
	int tyhUpdateByMoIntegral(@Param("mo") Memberinfo mo);
	
	//修改会员积分/余额
	int tyhUpdateByMIntegral(@Param("m") Member m);
	
	
	//新增会员消费记录
	int tyhInsertByJl(@Param("m") MemberInfos m);
	
	//查询会员剩余金额
	//Member tyhQueryBySyje(@Param("memberid") Integer memberid);
	
	//根据登录会员查询ID
	Member tyhQueryByHyName(@Param("membername") String membername);
	
	//登录会员/查询会员剩余金额
	Member tyhloginHy(@Param("membername") String membername,@Param("memberpwd") String memberpwd);
	
	//收银
	int tyhupdateBySettlementCenter(@Param("smid") String smid);
	
	//结算中心查看
	List<SettlementCenter> queryBySettlementCenter();

}
