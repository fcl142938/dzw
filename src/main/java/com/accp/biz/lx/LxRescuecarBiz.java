package com.accp.biz.lx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lx.LxRescuecarDao;
import com.accp.pojo.Rescuecar;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LxRescuecarBiz {

	@Autowired
	private LxRescuecarDao wqcldao;
	/**
	 * 查询所有车辆
	 * @return
	 */
	public PageInfo<Rescuecar> queryCarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<Rescuecar> list = wqcldao.selectList(null);
		PageInfo<Rescuecar> pageInfo=new PageInfo<Rescuecar>(list);
		System.out.println(pageInfo);
		return pageInfo;
	}
	/**
	 * 添加车辆
	 */
	public int addCar(Rescuecar car) {
		return wqcldao.insert(car);
	}
	/**
	 * 移除车辆
	 */
	public int deleteCar(int sid) {
		return wqcldao.deleteById(sid);
	}
	
	/**
	 * 根据id查看信息
	 * @return
	 */
	public Rescuecar queryCarBySid(int sid) {
		QueryWrapper<Rescuecar> qw=Wrappers.query();
		qw.eq("rescueid", sid);
		return wqcldao.selectOne(qw);
	}
	
	/**
	 * 修改车辆
	 * @param car
	 * @return
	 */
	public int modifCar(Rescuecar car) {
		return wqcldao.updateById(car);
	}
}
