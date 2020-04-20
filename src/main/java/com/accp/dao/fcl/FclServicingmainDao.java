package com.accp.dao.fcl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Servicingmain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface FclServicingmainDao extends BaseMapper<Servicingmain>{
	
	Integer queryCount();
	
	List<Servicingmain> queryAll();
}
