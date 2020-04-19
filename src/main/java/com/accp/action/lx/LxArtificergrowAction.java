package com.accp.action.lx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lx.LxArtificergrowBiz;
import com.accp.pojo.Artificergrow;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lx/api/bz")
public class LxArtificergrowAction {
	@Autowired
	private LxArtificergrowBiz biz;
	 /**
	  * 查询班组信息
	  * @param n
	  * @param s
	  * @return
	  */
	@GetMapping("queryBanzuAll/{n}/{s}")
	public PageInfo<Artificergrow> queryStarAll(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryStarAll(n,s);
	}
	/**
	 * 查询班组所有信息
	 * @return
	 */
	@GetMapping("queryBanzuList")
	public List<Artificergrow> queryBanzuList(){
		System.out.println(biz.queryBanzuList());
		return biz.queryBanzuList();
	}
	/**
	 * 新增班组表信息
	 * @param star 班组表对象
	 * @return
	 */
	@PostMapping("addBanzu")
	public Map<String, Object> zhuce(@RequestBody Artificergrow banzu) {
		int count=biz.addStar(banzu);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "ok");
			message.put("msg", "新增成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败！");
		}
		return message;
	}
	/**
	 * 根据班组编码查询班组信息
	 * @param bid班组编码
	 * @return
	 */
	@GetMapping("queryBanzuByBid/{bzid}")
	public Artificergrow queryStarBySid(@PathVariable int bzid) {
		return biz.queryStarBySid(bzid);
	}
	
	/**
	 * 根据编号删除班组信息
	 * @param bid班组编码
	 * @return
	 */
	@DeleteMapping("deleteBanzu/{bzid}")
	public Map<String, Object> deleteStar(@PathVariable int bzid) {
		int count=biz.deleteStar(bzid);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "200");
			message.put("msg", "删除成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败!");
		}
		return message;
	}
	/**
	 * 修改状态信息
	 * @param star
	 * @return
	 */
	@PutMapping("modifyBanzu")
	public Map<String, Object> modifStar(@RequestBody Artificergrow banzu) {
		int count=biz.modifStar(banzu);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "ok");
			message.put("msg", "修改成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "修改失败！");
		}
		return message;
	}
}
