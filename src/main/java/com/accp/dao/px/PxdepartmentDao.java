package com.accp.dao.px;

import java.util.List;

import com.accp.pojo.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface PxdepartmentDao extends BaseMapper<Department> {
	List<Department> query();

}
