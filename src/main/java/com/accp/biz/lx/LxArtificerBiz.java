package com.accp.biz.lx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lx.LxArtificerDao;
import com.accp.pojo.Artificer;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LxArtificerBiz {
	@Autowired
	private LxArtificerDao jgdao;
	/**
	 * 查询所有技工人员
	 * @return
	 */
	public PageInfo<Artificer> queryStarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<Artificer> list = jgdao.selectList(null);
		PageInfo<Artificer> pageInfo=new PageInfo<Artificer>(list);
		System.out.println(pageInfo);
		return pageInfo;
	}
	
	/**
	 * 根据id查看信息
	 * @return
	 */
	public Artificer queryStarBySid(int sid) {
		QueryWrapper<Artificer> qw=Wrappers.query();
		qw.eq("gid", sid);
		return jgdao.selectOne(qw);
	}
	/**
	 * 添加技工
	 */
	public int addBanzu(Artificer bz) {
		return jgdao.insert(bz);
	}
	/**
	 * 移除技工
	 */
	public int deleteBanzu(int gid) {
		return jgdao.deleteById(gid);
	}
	/**
	 * 修改技工
	 * @param bz
	 * @return
	 */
	public int modifCar(Artificer bz) {
		return jgdao.updateById(bz);
	}
}
