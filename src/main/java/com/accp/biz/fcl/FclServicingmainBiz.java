package com.accp.biz.fcl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.fcl.FclArtificergrowDao;
import com.accp.dao.fcl.FclConsumercarDao;
import com.accp.dao.fcl.FclRescuecarDao;
import com.accp.dao.fcl.FclServicingcourseDao;
import com.accp.dao.fcl.FclServicinginfoDao;
import com.accp.dao.fcl.FclServicingmainDao;
import com.accp.dao.fcl.FclTypeinfoDao;
import com.accp.pojo.Servicingmain;
import com.accp.pojo.Typeinfo;
import com.accp.pojo.Servicingcourse;
import com.accp.pojo.Artificergrow;
import com.accp.pojo.Rescuecar;
import com.accp.pojo.Servicinginfo;
import com.accp.pojo.Consumercar;
import com.accp.vo.fcl.FclSerAllVo;
import com.accp.vo.fcl.FclServicingmainVo;
import com.accp.vo.fcl.FclShowVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FclServicingmainBiz {

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

	@Resource
	private FclServicingcourseDao scdao;

	/**
	 * 条件分页
	 * 
	 * @param state
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageInfo<FclServicingmainVo> queryPage(Integer state, Integer currentPage, Integer pageSize,Integer status) {
		List<Servicingmain> list = null;
		Integer total = 0;

		// 查询全部
		if (state == -1) {
			total = dao.selectList(null).size();
			PageHelper.startPage(currentPage, pageSize);
			list = dao.selectList(null);		
		}else if(status!=null&&status==0) {
			total = dao.selectList(new QueryWrapper<Servicingmain>().eq("state",0).or().eq("state", 5)).size();
			PageHelper.startPage(currentPage, pageSize);
			list = dao.selectList(new QueryWrapper<Servicingmain>().eq("state",0).or().eq("state", 5));
		}else {
			total = dao.selectList(new QueryWrapper<Servicingmain>().eq("state", state)).size();
			PageHelper.startPage(currentPage, pageSize);
			list = dao.selectList(new QueryWrapper<Servicingmain>().eq("state", state));
		}

		List<FclServicingmainVo> listvo = new ArrayList<FclServicingmainVo>();
		list.forEach(temp -> {
			FclServicingmainVo vo = new FclServicingmainVo();
			vo.setName(cdao.selectOne(new QueryWrapper<Consumercar>().eq("consumerid", temp.getConsumerid()))
					.getCarnumber());
			vo.setGname(adao.selectOne(new QueryWrapper<Artificergrow>().eq("gid", temp.getGid())).getGname());
			vo.setSer(temp);
			vo.setList(sdao.selectList(new QueryWrapper<Servicinginfo>().eq("smid", temp.getSmid())));
			vo.setSlist(scdao.selectList(new QueryWrapper<Servicingcourse>().eq("smid", temp.getSmid())));
			listvo.add(vo);
		});
		PageInfo<FclServicingmainVo> pagetInfo = new PageInfo<FclServicingmainVo>(listvo);
		pagetInfo.setTotal(total);
		return pagetInfo;
	}

	/**
	 * 接车页面初始shuju
	 * 
	 * @return
	 */
	public FclSerAllVo queryRescuecar() {
		return new FclSerAllVo(rdao.selectList(new QueryWrapper<Rescuecar>().eq("state", 0)),
				adao.selectList(new QueryWrapper<Artificergrow>().eq("state", 0)), cdao.selectList(new QueryWrapper<Consumercar>().eq("conState",0)));
	}

	/**
	 * 添加
	 * 
	 * @param vo
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addSerMain(FclServicingmainVo vo) {
		//修改客户车状态
		Consumercar car= new Consumercar();
		car.setConstate(1);
		car.setConsumerid(vo.getSer().getConsumerid());
		cdao.updateById(car);
		// 添加主单 获取主单号
		String smid = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.getSer().setStarttime(new Date());
		vo.getSer().setSmid(smid);
		vo.getSer().setState(0);
		//后台计算总价格
		Double countprice = 0.0;
		for (Servicinginfo obj : vo.getList()) {
			obj.setSmid(smid);
			sdao.insert(obj);
			countprice += obj.getPrice();
		}
		vo.getSer().setPrice(countprice);
		vo.getSer().setCountprice(countprice);
		dao.insert(vo.getSer());
	}

	/**
	 * 删除
	 * 
	 * @param smid
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void removeById(String smid) {
		// 删除字表
		sdao.delete(new QueryWrapper<Servicinginfo>().eq("smid", smid));
		dao.delete(new QueryWrapper<Servicingmain>().eq("smid", smid));
	}

	// 检查
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modifyCourse(Servicingcourse se) {
		//System.out.println(se.getSmid());
		// 修改过程表
		scdao.update(se, new QueryWrapper<Servicingcourse>().eq("smid", se.getSmid()).eq("coursestate", 2));
		// 修改状态 合格
		Servicingmain sermain = dao.selectById(se.getSmid());
		if (se.getCoursestate() == 0) {
			sermain.setState(3);
			sermain.setEntime(new Date());
			//修改客户车状态
			Consumercar car= new Consumercar();
			car.setConstate(0);
			car.setConsumerid(sermain.getConsumerid());
			cdao.updateById(car);
		} else {
			//添加一条返工记录
			sdao.insert(new Servicinginfo(se.getSmid(), 0, "返工费", 200.0, "维修返工", 0));
			// 返工
			sermain.setState(5);
			sermain.setPrice(sermain.getCountprice()+200);
		}
		dao.updateById(sermain);
	}

	/**
	 * 首页数据
	 * 
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<FclServicingmainVo> queryShow() {
		List<Servicingmain> list = dao.selectList(new QueryWrapper<Servicingmain>().eq("starttime",
				new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		List<FclServicingmainVo> listvo = new ArrayList<FclServicingmainVo>();
		list.forEach(temp -> {
			FclServicingmainVo vo = new FclServicingmainVo();
			vo.setName(cdao.selectOne(new QueryWrapper<Consumercar>().eq("consumerid", temp.getConsumerid()))
					.getCarnumber());
			vo.setGname(adao.selectOne(new QueryWrapper<Artificergrow>().eq("gid", temp.getGid())).getGname());
			vo.setSer(temp);
			listvo.add(vo);
		});
		return listvo;
	}

	
	//统计
	public  FclShowVo queryShowData() {
		String date=new  SimpleDateFormat("yyyy-MM-dd").format(new Date());
		Double countprice=0.0;
		List<Servicingmain> list= dao.selectList(new QueryWrapper<Servicingmain>().eq("starttime",date).eq("state",5));
		if(list!=null&&list.size()!=0) {
			for (Servicingmain obj:list) {
				if(obj!=null) {
					countprice+=obj.getPrice();
				}
			}
		}	
		return new FclShowVo(countprice, dao.selectList(new QueryWrapper<Servicingmain>().eq("starttime",date)).size(), scdao.selectList(new QueryWrapper<Servicingcourse>().eq("courseendtime", date).eq("coursestate",3)).size(), scdao.selectList(new QueryWrapper<Servicingcourse>().eq("courseendtime", date).eq("coursestate",1)).size());
	}
	
	//技工操作
	public  void updateCourseState(String smid,Integer state) {
		//开始施工
		Servicingmain ser= new Servicingmain();
		ser.setSmid(smid);
		ser.setState(state);
		dao.updateById(ser);
		if(state==1) {
			scdao.insert(new Servicingcourse(null, smid, new Date(), null,3, null));
		}else {
			//提交施工
			scdao.update(new Servicingcourse(null, smid, null, new Date(),2, null),new QueryWrapper<Servicingcourse>().eq("smid",smid).eq("coursestate",3));
		}
		
	}
	
	/**
	 * 修改
	 * 
	 * @param vo
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void UpSerMain(FclServicingmainVo vo) {
		// 添加主单 获取主单号
		Servicingmain ser=new Servicingmain();
		ser.setSmid(vo.getSer().getSmid());
		sdao.delete(new QueryWrapper<Servicinginfo>().eq("smid", ser.getSmid()));
		Double countprice=0.0;
		for (Servicinginfo obj : vo.getList()) {
			obj.setSmid(ser.getSmid());
			sdao.insert(obj);
			countprice += obj.getPrice();
		}
		ser.setPrice(countprice);
		dao.updateById(ser);
	}
	
}
