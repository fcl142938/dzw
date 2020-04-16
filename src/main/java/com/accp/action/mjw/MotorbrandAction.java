package com.accp.action.mjw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.mjw.MotorbrandBiz;
import com.accp.pojo.Motorbrand;

import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/api/fadongjis")
public class MotorbrandAction {
	@Autowired
	private MotorbrandBiz biz;
	
	@GetMapping("showList/{pageNum}/{pageSize}")
	public PageInfo<Motorbrand> selectList(@PathVariable int pageNum,@PathVariable int pageSize) {
		

		return biz.selectList(pageNum, pageSize);
	}
	
	@PostMapping("add")
	public int selectList(@RequestBody Motorbrand entity) {
		

		return biz.insertOne(entity);
	}
	
	@PutMapping("upd")
	public int updateById(@RequestBody Motorbrand entity) {
		

		return biz.updateById(entity);
	}
	
	@DeleteMapping("delByid/{id}")
	public int deleteById(@PathVariable int id) {
		return biz.deleteById(id);
	}

}
