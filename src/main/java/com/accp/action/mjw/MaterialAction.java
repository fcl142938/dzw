package com.accp.action.mjw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.mjw.MaterialBiz;
import com.accp.pojo.Material;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@RestController
@RequestMapping("/api/materials")
public class MaterialAction {
	
	@Autowired
	private MaterialBiz biz;
	
	@GetMapping("address")
	public List<Material> selectMladdressList() {		
		
		return biz.selectMladdressList();
	}
	
	@GetMapping("address/{mladdress}")
	public List<Material> select(@PathVariable String mladdress) {
		
		return biz.select(mladdress);
	}
	
	@GetMapping("showlist/{mladdress}/{pageNum}/{pageSize}")
	public PageInfo<Material> selectlist(@PathVariable String mladdress,@PathVariable int pageNum,@PathVariable int pageSize) {
		return biz.selectlist(mladdress, pageNum, pageSize);
	}
	
	@PostMapping("add")
	public int insertOne(@RequestBody Material entity) {
		return biz.insertOne(entity);
	}
	
	@DeleteMapping("delByid/{id}")
	public int deleteById(@PathVariable int id) {
		return biz.deleteById(id);
	}

}
