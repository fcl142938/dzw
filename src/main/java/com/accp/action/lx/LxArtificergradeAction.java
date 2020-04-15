package com.accp.action.lx;

import java.util.HashMap;
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

import com.accp.biz.lx.LxArtificergradeBiz;
import com.accp.pojo.Artificergrade;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lx/api/xm1")
public class LxArtificergradeAction {

	@Autowired
	private LxArtificergradeBiz biz;
	 /**
	  * 查询技工星级
	  * @param n
	  * @param s
	  * @return
	  */
	@GetMapping("queryStarAll/{n}/{s}")
	public PageInfo<Artificergrade> queryStarAll(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryStarAll(n,s);
	}
	
	/**
	 * 新增技工星级
	 * @param star 状态表对象
	 * @return
	 */
	@PostMapping("addStar")
	public Map<String, Object> zhuce(@RequestBody Artificergrade star) {
		int count=biz.addStar(star);
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
	 * 根据状态编码查询状态信息
	 * @param sid状态编码
	 * @return
	 */
	@GetMapping("queryStarBySid/{sid}")
	public Artificergrade queryStarBySid(@PathVariable int sid) {
		return biz.queryStarBySid(sid);
	}
	
	/**
	 * 移除技工星级
	 * @param sid状态编码
	 * @return
	 */
	@DeleteMapping("deleteStar/{sid}")
	public Map<String, Object> deleteStar(@PathVariable int sid) {
		int count=biz.deleteStar(sid);
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
	 * 修改技工星级
	 * @param star
	 * @return
	 */
	@PutMapping("modifStar")
	public Map<String, Object> modifStar(@RequestBody Artificergrade star) {
		int count=biz.modifStar(star);
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
