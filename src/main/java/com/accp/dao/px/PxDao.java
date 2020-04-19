package com.accp.dao.px;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;
import com.accp.pojo.Position;
import com.accp.vo.px.PX;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface PxDao extends BaseMapper<PX>{
	List<PX> queryall(@Param("staffname") String staffname,@Param("departmentname")String departmentname,@Param("positionname")String positionname);
	List<PX> queryaleave(@Param("staffname") String staffname);
	List<PX> queryname();
	int updatestaff(@Param("sendtime")String sendtime,@Param("staffname")String staffname );
	int updatestaffinfo(@Param("staffname")String staffname );
	PX   selectbystaffid(@Param("staffid")Integer staffid);
	List<Position> selectposition();
	List<Position> querybypos(@Param("departmentid")Integer departmentid);

}
