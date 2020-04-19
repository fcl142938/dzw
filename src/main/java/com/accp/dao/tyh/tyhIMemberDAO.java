package com.accp.dao.tyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.pojo.Grade;
import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.vo.tyh.Members;
import com.accp.vo.tyh.tyhMemberInfo;

public interface tyhIMemberDAO {
	
	/* 会员充值 */
	int tyhUpdateByCz(@Param("m") Member m);
	
	/* 删除会员 */
	int tyhDelByMember(@Param("memberid") Integer memberid);
	
	/* 修改会员 */
	/*
	 * int tyhUpdateByMember(@Param("membername") String
	 * membername,@Param("memberpwd") String memberpwd);
	 */
	
	/* 根据会员ID查询会员消费记录 */
	List<tyhMemberInfo> tyhQueryByMemberinfo(@Param("memberid") Integer memberid); 
	
	/* 查询会员等级 */
	List<Grade> tyhQueryByGrade();
	
	/* 新增会员 */
	int tyhInsertByMember(@Param("m") Member m);
	
	/* 查询会员 */
	List<Members> tyhQueryByMember(); 

}
