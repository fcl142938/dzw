package com.accp;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.dao.fcl.FclStaffDao;

@SpringBootTest
class DzwApplicationTests {
	@Resource
	private  FclStaffDao dao;

	@Test
	void contextLoads() {
			dao.selectList(null).forEach(temp->{
				System.out.println();
			});
	}

}
