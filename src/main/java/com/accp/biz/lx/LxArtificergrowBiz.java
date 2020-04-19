package com.accp.biz.lx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lx.LxArtificergrowDao;
import com.accp.pojo.Artificergrow;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LxArtificergrowBiz {
	@Autowired
	private LxArtificergrowDao bzdao;
	
	/**
	 * 分页查询班组信息
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<Artificergrow> queryStarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<Artificergrow> list =bzdao.selectList(null);
		PageInfo<Artificergrow> pageInfo=new PageInfo<Artificergrow>(list);
		//System.out.println(pageInfo);
		return pageInfo;
	}
	/**
	 * 查询班组
	 * @return
	 */
	public List<Artificergrow> queryBanzuList(){
		return bzdao.selectList(null);
	}
	/**
	 * 新增班组表信息
	 * @param banzu
	 * @return
	 */
	public int addStar(Artificergrow banzu) {
		return bzdao.insert(banzu);
	}
	
	/**
	 * 根据id查看班组信息
	 * @param bzid班组编码
	 * @return
	 */
	public Artificergrow queryStarBySid(int bzid) {
		QueryWrapper<Artificergrow> qw=Wrappers.query();
		qw.eq("bzid", bzid);
		return bzdao.selectOne(qw);
	}
	
	/**
	 * 修改班组信息
	 * @param banzu
	 * @return
	 */
	public int modifStar(Artificergrow banzu) {
		return bzdao.updateById(banzu);
	}
	/**
	 * 根据编号删除班组信息
	 * @param bid班组id
	 * @return
	 */
	public int deleteStar(int bzid) {
		return bzdao.deleteById(bzid);
	}
}
