package com.accp.action.fcl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fcl.FclServicingmainBiz;
import com.accp.pojo.Servicingcourse;
import com.accp.vo.fcl.FclSerAllVo;
import com.accp.vo.fcl.FclServicingmainVo;
import com.accp.vo.fcl.FclShowVo;
import com.accp.vo.fcl.FclStaffVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("fcl/api/sermain")
public class FclServicingmainAction {
	
	@Resource
	private FclServicingmainBiz biz;
	
	@GetMapping("queryPage/{currentPage}/{pageSize}/{state}")
	public PageInfo<FclServicingmainVo> queryPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize, @PathVariable Integer state ){
		return biz.queryPage(state, currentPage, pageSize);
	}
	
	/**
	 * 页面初始数据
	 * @return
	 */
	@GetMapping("queryRescuecar")
	public FclSerAllVo queryRescuecar() {
		return biz.queryRescuecar();
	}
	
	@PostMapping("addSerMain")
	public  String addSerMain(@RequestBody FclServicingmainVo vo,HttpSession session) {
		//FclStaffVo staff=(FclStaffVo)session.getAttribute("stfvo");
		//vo.getSer().setStaffid(staff.getStf().getStaffid());;
		biz.addSerMain(vo);
		return "ok";
	}
	
	@GetMapping("removeById/{smid}")
	public  String removeById(@PathVariable String smid) {
		biz.removeById(smid);
		return "ok";
	}
	
	@PostMapping("modifyCourse")
	public  String modifyCourse(@RequestBody Servicingcourse se) {
		biz.modifyCourse(se);
		return "ok";
	}
	
	@GetMapping("queryShow")
	public List<FclServicingmainVo> queryShow(){
		return biz.queryShow();
	}
	
	@GetMapping("queryShowData")
	public  FclShowVo queryShowData() {
		return biz.queryShowData();
	}
	
}
