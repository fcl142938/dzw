package com.accp.dao.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.tyh.SettlementCenter;

public interface tyhISettlementCenterDAO {
	
	//多条件查询
	List<SettlementCenter> queryByMaxSettlementCenter(@Param("state") Integer state);
	
	//回滚
	int tyhupdateByHgSettlementCenter(@Param("smid") Integer smid);
	
	//收银
	int tyhupdateBySettlementCenter(@Param("smid") Integer smid);
	
	//结算中心查看
	List<SettlementCenter> queryBySettlementCenter();

}
