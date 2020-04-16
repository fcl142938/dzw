package com.accp.action.mjw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.mjw.ShoppinginfoBiz;
import com.accp.pojo.Shoppinginfo;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/shoppings")
public class ShoppinginfoAction {
	@Autowired
	private ShoppinginfoBiz biz;
	
	@GetMapping("shoppingsinfo/{pageNum}/{pageSize}")
	public PageInfo<Shoppinginfo> pageInfo(@PathVariable int pageNum,@PathVariable int pageSize) {
		
		return biz.pageInfo(pageNum, pageSize);
	}
	
	
	@DeleteMapping("del/{id}")
	public int deleteById(@PathVariable int id) {
		return biz.deleteById(id);
	}
	
	@PostMapping("addshopping")
	public int insertOne(@RequestBody Shoppinginfo entity) {
		return biz.insertOne(entity);
	}
	
}
