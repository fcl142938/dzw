package com.accp.action.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lyf.LyfClzlBiz;
import com.accp.biz.lyf.LyfKhzlBiz;
import com.accp.pojo.Consumercar;
import com.accp.pojo.Consumerinfo;

@RestController
@RequestMapping("/api/LyfKhzlAction")
public class LyfAction {
	@Autowired
	private LyfKhzlBiz lyfkhzlbiz;
	@Autowired
	private LyfClzlBiz lyfclzlbiz;
	@GetMapping()
	public List<Consumerinfo> khzl() {
		return lyfkhzlbiz.khzl();
	}
	@GetMapping("xuanzhongconsumerinfochache/{userid}")
	public List<Consumercar> clzl(@PathVariable String userid) {
		return lyfclzlbiz.clzl(userid);
	}
}
