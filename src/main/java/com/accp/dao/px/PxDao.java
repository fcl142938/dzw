package com.accp.dao.px;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.px.PX;

public interface PxDao {
	List<PX> queryall(@Param("staffname") String staffname);

}
