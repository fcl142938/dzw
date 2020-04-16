package com.accp.biz.lx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lx.LxArtificergradeDao;
import com.accp.pojo.Artificergrade;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LxArtificergradeBiz {
	@Autowired
	private LxArtificergradeDao xjjgdao;
	/**
	 * 查询所有技工星级
	 * @return
	 */
	public PageInfo<Artificergrade> queryStarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<Artificergrade> list = xjjgdao.selectList(null);
		PageInfo<Artificergrade> pageInfo=new PageInfo<Artificergrade>(list);
		System.out.println(pageInfo);
		return pageInfo;
	}
	/**
	 * 添加星级
	 */
	public int addStar(Artificergrade star) {
		return xjjgdao.insert(star);
	}
	/**
	 * 移除星级
	 */
	public int deleteStar(int sid) {
		return xjjgdao.deleteById(sid);
	}
	
	/**
	 * 根据id查看信息
	 * @return
	 */
	public Artificergrade queryStarBySid(int sid) {
		QueryWrapper<Artificergrade> qw=Wrappers.query();
		qw.eq("agid", sid);
		return xjjgdao.selectOne(qw);
	}
	
	/**
	 * 修改技工星级
	 * @param star
	 * @return
	 */
	public int modifStar(Artificergrade star) {
		return xjjgdao.updateById(star);
	}
}
