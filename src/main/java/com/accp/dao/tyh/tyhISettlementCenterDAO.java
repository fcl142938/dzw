package com.accp.dao.tyh;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.tyh.SettlementCenter;
import com.accp.vo.tyh.tyhParticulars;

public interface tyhISettlementCenterDAO {
	
	/* 维修项目 */
	List<tyhParticulars> tyhQueryByXm(@Param("infoid") Integer infoid);
	
	/* 打开单据 */
	tyhParticulars tyhQueryByXq(@Param("smid") Integer smid);
	
	//多条件查询
	List<SettlementCenter> queryByMaxSettlementCenter(@Param("state") String state,@Param("smid") String smid,@Param("carnumber") String carnumber,@Param("username") String username,@Param("staffname") String staffname,@Param("userremark") String userremark,@Param("starttime") String starttime,@Param("entime") String entime);
	
	//回滚
	int tyhupdateByHgSettlementCenter(@Param("smid") Integer smid);
	
	//收银
	int tyhupdateBySettlementCenter(@Param("smid") Integer smid);
	
	//结算中心查看
	List<SettlementCenter> queryBySettlementCenter();

}
