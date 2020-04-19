package com.accp.dao.lyf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Servicingmain;
import com.accp.vo.lyf.LyfWxjlVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface LyfServicingmainDao extends BaseMapper<Servicingmain>{
	List<LyfWxjlVo> wxjl(@Param("consumerid") Integer consumerid);
}
