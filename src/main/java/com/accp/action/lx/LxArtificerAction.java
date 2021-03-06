package com.accp.action.lx;

import java.util.Date;
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

import com.accp.biz.lx.LxArtificerBiz;
import com.accp.pojo.Artificer;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lx/api/jg")
public class LxArtificerAction {
	@Autowired
	private LxArtificerBiz biz;
	 /**
	  * 查询技工星级
	  * @param n
	  * @param s
	  * @return
	  */
	@GetMapping("queryStarAll/{n}/{s}")
	public PageInfo<Artificer> queryStarAll(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryStarAll(n,s);
	}
	/**
	 * 根据班组编码查询班组信息
	 * @param bid班组编码
	 * @return
	 */
	@GetMapping("queryBanzujgByBid/{sid}/{n}/{s}")
	public PageInfo<Artificer> queryBanzujgByBid(@PathVariable Integer sid,@PathVariable Integer n,@PathVariable Integer s) {
		System.out.println("nnn"+n+"sss"+s);
		return biz.queryStarBySid(sid,n,s);
	}
	
	/**
	 * 根据班组编码查询班组信息
	 * @param bid班组编码
	 * @return
	 */
	@GetMapping("queryid/{bzid}")
	public Artificer queryStarBySid(@PathVariable int bzid) {
		return biz.queryStarBySid(bzid);
	}
	
	/**
	 * 新增班组
	 * @param bz
	 * @return
	 */
	@PostMapping("addbanzu")
	public Map<String, Object> addbanzujg(@RequestBody Artificer bz) {
		bz.setStartime(new Date());
		int count=biz.addBanzu(bz);
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
	 * 移除班组
	 * @param gid状态编码
	 * @return
	 */
	@DeleteMapping("deletebanzu/{gid}")
	public Map<String, Object> deleteBanzu(@PathVariable int gid) {
		int count=biz.deleteBanzu(gid);
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
	 * 修改班组
	 * @param star
	 * @return
	 */
	@PutMapping("modifBanzu")
	public Map<String, Object> modifStar(@RequestBody Artificer car) {
		int count=biz.modifCar(car);
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
	
	@GetMapping("dejg/{aid}")
	public  String dejg(@PathVariable Integer aid) {
		biz.dejg(aid);
		return "ok";
	}
}
