package com.accp.action.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lyf.LyfCheliangpinpaiBiz;
import com.accp.biz.lyf.LyfChexingBiz;
import com.accp.biz.lyf.LyfClzlBiz;
import com.accp.biz.lyf.LyfKhzlBiz;
import com.accp.biz.lyf.LyfShengBiz;
import com.accp.biz.lyf.LyfShiquBiz;
import com.accp.pojo.Addressinfo;
import com.accp.pojo.Carbrand;
import com.accp.pojo.Consumercar;
import com.accp.pojo.Consumerinfo;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Province;
import com.accp.vo.lyf.LyfClzlVo;

@RestController
@RequestMapping("/api/LyfKhzlAction")
public class LyfAction {
	@Autowired
	private LyfKhzlBiz lyfkhzlbiz;
	@Autowired
	private LyfClzlBiz lyfclzlbiz;
	@Autowired
	private LyfShengBiz lyfshengbiz;
	@Autowired
	private LyfShiquBiz lyfshiqubiz;
	@Autowired
	private LyfCheliangpinpaiBiz lyfcheliangpinpaibiz;
	@Autowired
	private LyfChexingBiz lyfchexingbiz;
	@GetMapping()
	public List<Consumerinfo> khzl() {
		return lyfkhzlbiz.khzl();
	}
	@GetMapping("xuanzhongconsumerinfochache/{userid}")
	public List<LyfClzlVo> clzl(@PathVariable String userid) {
		return lyfclzlbiz.clzl(userid);
	}
	@GetMapping("sheng")
	public List<Province> sheng() {
		return lyfshengbiz.sheng();
	}
	@GetMapping("shiqu/{id}")
	public List<Addressinfo> shiqu(@PathVariable String id) {
		return lyfshiqubiz.shiqu(id);
	}
	@GetMapping("cheliangpinpai")
	public List<Carbrand> cheliangpinpai() {
		return lyfcheliangpinpaibiz.cheliangpinpai();
	}
	@GetMapping("chexing/{id}")
	public List<Motorcycle> chexing(@PathVariable String id) {
		return lyfchexingbiz.chexing(id);
	}
}
