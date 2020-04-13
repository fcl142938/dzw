package com.accp.dao.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Member;

public interface tyhIMemberDAO {
	
	/* 新增会员 */
	int tyhInsertByMember(@Param("m") Member m);
	
	/* 查询会员 */
	List<Member> tyhQueryByMember(); 

}
