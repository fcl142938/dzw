package com.accp.dao.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Position;
import com.accp.vo.tyh.PositionAndDepartment;

public interface tyhIpositionDAO {
	
	/* ... */
	
	/* 删除岗位 */
	int tyhDelPositionById(@Param("positionid") Integer positionid);
	
	/* 修改岗位 */
	int tyhUpdateByPosition(@Param("p") Position p);
	
	/* 新增岗位 */
	int tyhinsertByPosition(@Param("p") Position p);
	
	/* 根据岗位ID查询岗位ID是否存在（未完成） */
	int tyhQueryByPositionId(@Param("positionid") Integer positionid);
	
	/* 查询所有岗位 */
	List<PositionAndDepartment> tyhQueryByPositionAll();

}
