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
import com.accp.dao.fcl.FclStaffDao;
import com.accp.pojo.Collocationpower;
import com.accp.pojo.Power;
import com.accp.pojo.Staff;
import com.accp.vo.fcl.FclPowerVo;
import com.accp.vo.fcl.FclStaffVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FclStaffBiz {
		
	//@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	@Resource
	private  FclStaffDao dao;
	
	//权限表
	@Resource
	private FclPowerDao  pdao;
	
	//中间表
	@Resource
	private FclCollocationpowerDao cdao;
	
	//登录并获取权限
	public FclStaffVo login(String staffname,String staffpwd) {
		FclStaffVo svo= new FclStaffVo();
		//账户 密码 状态  确实账户信息
		QueryWrapper<Staff> qw=Wrappers.query();
		svo.setStf(dao.selectOne(qw.eq("staffaccount", staffname).eq("staffpwd",staffpwd )));
		if(svo.getStf()!=null) {
			QueryWrapper<Collocationpower> qw1=Wrappers.query();
			//查询中间表	重新组织成一个list集合
			List<Integer> list=cdao.selectList(qw1.eq("positionid", svo.getStf().getPositionid())).stream().map(Collocationpower::getPowerid).collect(Collectors.toList());
			if(list!=null&&list.size()!=0) {
				List<FclPowerVo> listvo= new ArrayList<FclPowerVo>();
				pdao.selectList(new QueryWrapper<Power>().lambda().in(Power::getPowerid,list)).forEach(temp->{
					//循环生成一级节点
					if(temp.getPowerparent()==0) {
						listvo.add(changeTree(temp,list));
					}		
				});
				svo.setList(listvo);
			}		
			 return svo;
		}else {
			return null;
		}
		
	}
	
	/***
	 * 获取所有权限
	 * @return
	 */
	public  List<FclPowerVo> powerGet(){
		//查询中间表	重新组织成一个list集合
		List<Integer> list=pdao.selectList(null).stream().map(Power::getPowerid).collect(Collectors.toList());
		List<FclPowerVo> listvo= new ArrayList<FclPowerVo>();
		pdao.selectList(new QueryWrapper<Power>().lambda().in(Power::getPowerid,list)).forEach(temp->{
			//循环生成一级节点
			if(temp.getPowerparent()==0) {
				listvo.add(changeTree(temp,list));
			}		
		});
		return listvo;
	}
	
	/**
	 * 获取职位权限id
	 * @param positionid
	 * @return
	 */
	public  List<Integer> poweridGet(Integer positionid){
		QueryWrapper<Collocationpower> qw=Wrappers.query();
		return cdao.selectList(qw.eq("positionid", positionid)).stream().map(Collocationpower::getPowerid).collect(Collectors.toList());
	}
	
	/**
	 * 递归查询上级,生成节点树，字节点生成
	 * @param power
	 * @return
	 */
	private FclPowerVo changeTree(Power power,List<Integer> arr) {
			List<Power> list=pdao.selectList(new QueryWrapper<Power>().eq("powerparent", power.getPowerid()).lambda().in(Power::getPowerid,arr ));
			if(list!=null) {
				List<FclPowerVo> listvo= new ArrayList<FclPowerVo>();
				list.forEach(temp->{
					listvo.add(changeTree(temp,arr));
				});
				FclPowerVo vo= new FclPowerVo(power.getPowerid(),power.getPowername(),power.getPowerparent(),power.getPowersrc(),listvo);
				return vo;
			}else {
				return new FclPowerVo(power.getPowerid(),power.getPowername(),power.getPowerparent(),power.getPowersrc(),null);
			}		
	}
}
