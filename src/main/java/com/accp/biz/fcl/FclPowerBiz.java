package com.accp.biz.fcl;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclCollocationpowerDao;
import com.accp.dao.fcl.FclPowerDao;
import com.accp.pojo.Power;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FclPowerBiz {

	// @Transactional(propagation = Propagation.REQUIRED, isolation =
	// Isolation.READ_COMMITTED, readOnly = false)
	@Resource
	private FclPowerDao pdao;

	@Resource
	private FclCollocationpowerDao dao;

	/**
	 * 权限配置表修改
	 * 
	 * @param positionid
	 * @param powerid
	 */
	public void modifyPower(Integer positionid, List<Integer> list) {	
		//生成未有的一 二级权限  
		list.forEach(temp->{
			Integer powerid=pdao.selectOne(new QueryWrapper<Power>().eq("powerparent",temp)).getPowerid();
			//没有进行添加
			if(list.indexOf(powerid)==-1&&powerid!=null) {
				list.add(powerid);
			}
		});
		list.forEach(temp->{
			System.out.println(temp);
		});
	}
}
