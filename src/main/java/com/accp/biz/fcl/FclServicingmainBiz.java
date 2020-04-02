package com.accp.biz.fcl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclConsumercarDao;
import com.accp.dao.fcl.FclServicinginfoDao;
import com.accp.dao.fcl.FclServicingmainDao;
import com.accp.dao.fcl.FclTypeinfoDao;
import com.accp.pojo.Servicingmain;
import com.accp.pojo.Typeinfo;
import com.accp.pojo.Servicinginfo;
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
			vo.setList(tdao.selectList(new QueryWrapper<Typeinfo>().in("infoid",
					sdao.selectList(new QueryWrapper<Servicinginfo>().eq("smid", temp.getSmid())).stream()
							.map(Servicinginfo::getInfoid).collect(Collectors.toList()))));
			listvo.add(vo);
		});
		return new  PageInfo<>(listvo);
	}

}
