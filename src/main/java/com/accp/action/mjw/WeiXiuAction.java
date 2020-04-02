package com.accp.action.mjw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.mjw.TypeBiz;
import com.accp.biz.mjw.TypeInfoBiz;
import com.accp.pojo.Type;
import com.accp.pojo.Typeinfo;
import com.accp.vo.mjw.TypeVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/weixius")
public class WeiXiuAction {
	@Autowired
	private TypeBiz tbiz;
	
	@Autowired
	private TypeInfoBiz ibiz;
	
	@GetMapping("pingpais/{num}")
	public List<TypeVo> selectList(@PathVariable int num) {
		return tbiz.selectList(num);
	}
	
	/**
	 * 根据主键id查询一条
	 * @param num
	 * @return
	 */
	@GetMapping("pingpai/{num}")
	public Typeinfo selectOne(@PathVariable int num) {
		return ibiz.selectOne(num);
	}
	/**
	 * 根据主键id修改
	 * @param num
	 * @return
	 */
	@PutMapping("pingpai")
	public int selectList(@RequestBody Typeinfo t) {
		System.out.println("add");
		return ibiz.updateById(t);   
	}
	
	/**
	 *新增
	 * @param num
	 * @return
	 */
	@PostMapping("pingpai")
	public int insertOne(@RequestBody Typeinfo t) {
		return ibiz.insertOne(t);
	}
	
	@GetMapping("TypeInfo/{pageNum}/{pageSize}/{typeid}")
	public PageInfo<Typeinfo> selecTypeInfotList(@PathVariable int pageNum,@PathVariable int pageSize, @PathVariable int typeid) {
		return ibiz.selecTypeInfotList(pageNum, pageSize, typeid);
	}
	
	
	@DeleteMapping("deleteById/{id}")
	public int deleteById(@PathVariable int id) {
		return ibiz.deleteById(id);
	}

}
