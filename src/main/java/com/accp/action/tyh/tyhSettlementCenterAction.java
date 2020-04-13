package com.accp.action.tyh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tyh.tyhSettlementCenterBiz;
import com.accp.vo.tyh.SettlementCenter;

@RestController
@RequestMapping("/tyh/api/sc")
public class tyhSettlementCenterAction {
	
	@Autowired
	private tyhSettlementCenterBiz biz;
	
	//多条件查询
	@GetMapping("/queryByMaxSettlementCenter/{state}")
	public List<SettlementCenter> queryByMaxSettlementCenter(@PathVariable Integer state){
		if(state == 3) {
			state = 3;
		} else if(state == 4) {
			state = 4;
		}
		return biz.queryByMaxSettlementCenter(state);
	}
	
	/**
	 * 回滚
	 * @param smid
	 * @return
	 */
	@PutMapping("/tyhupdateByHgSettlementCenter/{smid}")
	public Map<String, Object> tyhupdateByHgSettlementCenter(@RequestBody Integer smid) {
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhupdateByHgSettlementCenter(smid) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 收银
	 * @param smid
	 * @return
	 */
	@PutMapping("/tyhupdateBySettlementCenter/{smid}")
	public Map<String, Object> tyhupdateBySettlementCenter(@RequestBody Integer smid) {
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhupdateBySettlementCenter(smid) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 结算中心查看
	 * @return
	 */
	@GetMapping()
	public List<SettlementCenter> queryBySettlementCenter(){
		return biz.queryBySettlementCenter();
	}

}
