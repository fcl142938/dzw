package com.accp.dao.px;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;
import com.accp.pojo.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface PxdepartmentDao extends BaseMapper<Department> {
	List<Position> querybydepid(@Param("departmentid")Integer departmentid);

	
   
}
