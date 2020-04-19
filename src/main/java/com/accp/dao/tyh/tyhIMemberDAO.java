package com.accp.dao.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Grade;
import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.vo.tyh.Members;
import com.accp.vo.tyh.tyhMemberInfo;

public interface tyhIMemberDAO {
	
	/* 根据会员ID查询会员消费记录 */
	List<tyhMemberInfo> tyhQueryByMemberinfo(@Param("memberid") Integer memberid); 
	
	/* 查询会员等级 */
	List<Grade> tyhQueryByGrade();
	
	/* 新增会员 */
	int tyhInsertByMember(@Param("m") Member m);
	
	/* 查询会员 */
	List<Members> tyhQueryByMember(); 

}
