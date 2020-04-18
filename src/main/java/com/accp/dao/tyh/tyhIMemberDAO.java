package com.accp.dao.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Grade;
import com.accp.pojo.Member;
import com.accp.vo.tyh.Members;

public interface tyhIMemberDAO {
	
	/* 查询会员等级 */
	List<Grade> tyhQueryByGrade();
	
	/* 新增会员 */
	int tyhInsertByMember(@Param("m") Member m);
	
	/* 查询会员 */
	List<Members> tyhQueryByMember(); 

}
