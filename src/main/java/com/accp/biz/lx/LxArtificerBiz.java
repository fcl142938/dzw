package com.accp.biz.lx;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclArtificerDao;
import com.accp.dao.fcl.FclArtificergradeDao;
import com.accp.dao.fcl.FclArtificergrowDao;
import com.accp.dao.lx.LxArtificerDao;
import com.accp.pojo.Artificer;
import com.accp.pojo.Artificergrow;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LxArtificerBiz {
	@Autowired
	private LxArtificerDao jgdao;
	
	@Resource
	FclArtificergrowDao dao;
	
	@Resource
	FclArtificergradeDao adao;
	
	@Resource
	FclArtificerDao fdao;
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
	public PageInfo<Artificer> queryStarBySid(Integer sid,Integer n ,Integer s) {
		PageHelper.startPage(n,s);
		QueryWrapper<Artificer> qw=Wrappers.query();
		qw.eq("gid", sid);
		List<Artificer> list = jgdao.selectList(qw);
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
		qw.eq("aid", sid);
		return jgdao.selectOne(qw);
	}
	/**
	 * 添加技工
	 */
	public int addBanzu(Artificer bz) {
		//修改班组价格
		Artificergrow ar=dao.selectById(bz.getGid());
		ar.setGprice(ar.getGprice()+adao.selectById(bz.getAgid()).getAgprice());;
		dao.updateById(ar);
		return jgdao.insert(bz);
	}
	/**
	 * 移除技工
	 */
	public int deleteBanzu(int gid) {
		System.out.println(gid);
		List<Artificer> list=fdao.selectList(new QueryWrapper<Artificer>().eq("gid", gid));
		if(list!=null&&list.size()!=0) {
			return 0;
		}
		Artificergrow ar= new Artificergrow();
		ar.setGid(gid);
		ar.setState(1);
		return dao.updateById(ar);
	}
	/**
	 * 修改技工
	 * @param bz
	 * @return
	 */
	public int modifCar(Artificer bz) {
		//减原班组的钱  逻辑处理
		Artificer a=fdao.selectById(bz.getAid());
		Artificergrow ar=dao.selectById(a.getGid());
		ar.setGprice(ar.getGprice()-adao.selectById(a.getAgid()).getAgprice());
		dao.updateById(ar);
		//添加
		Artificergrow ar1=dao.selectById(bz.getGid());
		ar1.setGprice(ar1.getGprice()+adao.selectById(bz.getAgid()).getAgprice());;
		dao.updateById(ar1);
		return jgdao.updateById(bz);
	}
}
