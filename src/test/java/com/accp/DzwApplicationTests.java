package com.accp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.fcl.FclServicingmainBiz;
import com.accp.dao.fcl.FclStaffDao;
import com.accp.pojo.Servicinginfo;
import com.accp.pojo.Servicingmain;
import com.accp.vo.fcl.FclServicingmainVo;

@SpringBootTest
class DzwApplicationTests {
	@Resource
	private  FclStaffDao dao;
	
	@Resource
	private FclServicingmainBiz biz;

	@Test
	void contextLoads() {
		System.out.println("123");
		FclServicingmainVo vo = new FclServicingmainVo();
		vo.setSer(new Servicingmain());
		List<Servicinginfo> list= new ArrayList<Servicinginfo>();
		list.add(new Servicinginfo());
		list.add(new Servicinginfo());
		vo.setList(list);
		biz.addSerMain(vo);
		System.out.println("123");
	}

}
