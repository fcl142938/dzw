package com.accp.biz.fcl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclArtificergrowDao;
import com.accp.dao.fcl.FclConsumercarDao;
import com.accp.dao.fcl.FclRescuecarDao;
import com.accp.dao.fcl.FclServicinginfoDao;
import com.accp.dao.fcl.FclServicingmainDao;
import com.accp.dao.fcl.FclTypeinfoDao;
import com.accp.pojo.Servicingmain;
import com.accp.pojo.Typeinfo;
import com.accp.pojo.Artificergrow;
import com.accp.pojo.Rescuecar;
import com.accp.pojo.Servicinginfo;
import com.accp.vo.fcl.FclSerAllVo;
import com.accp.vo.fcl.FclServicingmainVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FclServicingmainBiz {

	// @Transactional(propagation = Propagation.REQUIRED, isolation =
	// Isolation.READ_COMMITTED, readOnly = false)

	@Resource
	private FclServicingmainDao dao;

	@Resource
	private FclTypeinfoDao tdao;

	@Resource
	private FclConsumercarDao cdao;

	@Resource
	private FclServicinginfoDao sdao;

	@Resource
	private FclRescuecarDao rdao;

	@Resource
	private FclArtificergrowDao adao;

	/**
	 * 条件分页
	 * 
	 * @param state
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageInfo<FclServicingmainVo> queryPage(Integer state, Integer currentPage, Integer pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<Servicingmain> list = null;
		// 查询全部
		if (state != -1) {
			list = dao.selectList(new QueryWrapper<Servicingmain>().eq("state", state));
		} else {
			list = dao.selectList(null);
		}

		List<FclServicingmainVo> listvo = new ArrayList<FclServicingmainVo>();
		list.forEach(temp -> {
			FclServicingmainVo vo = new FclServicingmainVo();
			vo.setSer(temp);
			vo.setList(sdao.selectList(new QueryWrapper<Servicinginfo>().eq("smid", temp.getSmid())));
			listvo.add(vo);
		});
		return new PageInfo<>(listvo);
	}

	/**
	 * 接车页面初始shuju
	 * 
	 * @return
	 */
	public FclSerAllVo queryRescuecar() {
		return new FclSerAllVo(rdao.selectList(new QueryWrapper<Rescuecar>().eq("state", 0)),
				adao.selectList(new QueryWrapper<Artificergrow>().eq("state", 0)), cdao.selectList(null));
	}
}
