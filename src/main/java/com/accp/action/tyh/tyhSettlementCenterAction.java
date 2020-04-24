package com.accp.action.tyh;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tyh.tyhSettlementCenterBiz;
import com.accp.clg.AlipayService;
import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.vo.tyh.MemberInfos;
import com.accp.vo.tyh.SettlementCenter;
import com.accp.vo.tyh.tyhParticulars;

@RestController
@RequestMapping("/tyh/api/sc")
public class tyhSettlementCenterAction {
	
	@Autowired
	private tyhSettlementCenterBiz biz;
	
	 @Autowired
	  AlipayService alipayService;
	
	/**
	 *  维修项目 
	 * @param infoid
	 * @return
	 */
	@GetMapping("/tyhQueryByXm/{infoid}")
	public List<tyhParticulars> tyhQueryByXm(@PathVariable Integer infoid){
		return biz.tyhQueryByXm(infoid);
	}
	
	/**
	 *  打开单据 
	 */
	@GetMapping("/tyhQueryByXq/{smid}")
	public tyhParticulars tyhQueryByXq(@PathVariable String smid) {
		return biz.tyhQueryByXq(smid);
	}
	
	/**
	 * 多条件查询
	 * @param state
	 * @param smid
	 * @param carnumber
	 * @param username
	 * @param staffname
	 * @param userremark
	 * @param starttime
	 * @param entime
	 * @return
	 */
	@GetMapping("/queryByMaxSettlementCenter/{state}/{smid}/{carnumber}/{username}/{staffname}/{userremark}/{starttime}/{entime}")
	public List<SettlementCenter> queryByMaxSettlementCenter(@PathVariable String state,@PathVariable String smid,@PathVariable String carnumber,@PathVariable String username,@PathVariable String staffname,@PathVariable String userremark,@PathVariable String starttime,@PathVariable String entime){
		System.out.println("========="+starttime+"+"+entime);
		return biz.queryByMaxSettlementCenter(state, smid, carnumber, username, staffname, userremark, starttime, entime);
	}
	
	/**
	 * 回滚
	 * @param smid
	 * @return
	 */
	@PutMapping("/tyhupdateByHgSettlementCenter/{smid}")
	public Map<String, Object> tyhupdateByHgSettlementCenter(@RequestBody String smid) {
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhupdateByHgSettlementCenter(smid) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 修改会员消费金额/余额
	 * @param mo
	 * @return
	 */
	@PutMapping("/tyhUpdateByMoIntegral")
	public Map<String, Object> tyhUpdateByMoIntegral(@RequestBody Memberinfo mo) {
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhUpdateByMoIntegral(mo) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 修改会员积分/余额
	 * @param memberid
	 * @return
	 */
	@PutMapping("/tyhUpdateByMIntegral")
	public Map<String, Object> tyhUpdateByMIntegral(@RequestBody Member m) {
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhUpdateByMIntegral(m) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 新增会员消费记录
	 * @param m
	 * @return
	 */
	@PostMapping("/tyhInsertByJl")
	public Map<String, Object> tyhInsertByJl(@RequestBody MemberInfos m) {
		Map<String, Object> message = new HashMap<String, Object>();
		System.out.println(m);
		if(biz.tyhInsertByJl(m) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}
	
	/**
	 * 根据登录会员查询ID
	 * @param membername
	 * @return
	 */
	@GetMapping("/tyhQueryByHyName/{membername}")
	public Member tyhQueryByHyName(@PathVariable String membername) {
		return biz.tyhQueryByHyName(membername);
	}
	
	/**
	 * 登录会员
	 * @param membername
	 * @param memberpwd
	 * @return
	 */
	@GetMapping("/tyhloginHy/{membername}/{memberpwd}")
	public Map<String, Object> tyhloginHy(@PathVariable String membername,@PathVariable String memberpwd) {
		System.out.println(membername+memberpwd);
		Map<String, Object> message = new HashMap<String, Object>();
		if(biz.tyhloginHy(membername, memberpwd) != null) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
		}
		return message;
	}

	
	/**
	 * 收银//二维码收款
	 * @param smid
	 * @return
	 * @throws IOException 
	 */
	@GetMapping("/tyhupdateBySettlementCenter/{smid}")
	public Map<String, Object>  tyhupdateBySettlementCenter(@PathVariable String smid) throws IOException {
		Map<String, Object> message = new HashMap<String, Object>();
		System.out.println(smid);
		if(biz.tyhupdateBySettlementCenter(smid) > 0) {
			message.put("code", "200");
		} else {
			message.put("code", "500");
			}
			return message;
	}
	
	//二维码收款
	@GetMapping("/showalipay/{smid}/{state}")
	public String showalipay(HttpServletResponse response, HttpServletRequest request,@PathVariable String smid,@PathVariable Integer state) throws IOException {
		Map<String, Object> message = new HashMap<String, Object>();
		return alipayService.aliPay(response, request, smid,state);
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
