package com.accp.biz.fcl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclCollocationpowerDao;
import com.accp.dao.fcl.FclPowerDao;
import com.accp.pojo.Collocationpower;
import com.accp.pojo.Power;
import com.accp.vo.fcl.FclPowerUpVo;
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
	public void modifyPower(FclPowerUpVo vo) {
		// 生成未有的一 二级权限
		List<Integer> list = new ArrayList<Integer>();
		vo.getList().forEach(temp -> {
			Integer powerid = pdao.selectOne(new QueryWrapper<Power>().eq("powerid", temp)).getPowerparent();
			System.out.println(powerid);
			list.add(temp);
			// 没有进行添加
			if (list.indexOf(powerid) == -1 && powerid != 0) {
				list.add(powerid);
			}
			// 一级添加
			if (powerid != 0) {
				Integer powerid2 = pdao.selectOne(new QueryWrapper<Power>().eq("powerid", powerid)).getPowerparent();
				if (list.indexOf(powerid2) == -1 && powerid2 != 0) {
					list.add(powerid2);
				}
			}
		});

		// 删除原有权限 ，添加现有权限
		dao.delete(new QueryWrapper<Collocationpower>().eq("positionid", vo.getPositionid()));
		list.forEach(temp->{
			dao.insert(new  Collocationpower(temp, vo.getPositionid()));
		});
	}
}
