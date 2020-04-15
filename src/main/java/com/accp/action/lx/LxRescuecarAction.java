package com.accp.action.lx;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lx.LxRescuecarBiz;
import com.accp.pojo.Rescuecar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lx/api/car")
public class LxRescuecarAction {


		@Autowired
		private LxRescuecarBiz biz;
		 /**
		  * 查询车辆
		  * @param n
		  * @param s
		  * @return
		  */
		@GetMapping("queryCarAll/{n}/{s}")
		public PageInfo<Rescuecar> queryCarAll(@PathVariable Integer n,@PathVariable Integer s) {		
			return biz.queryCarAll(n,s);
		}
		
		/**
		 * 新增车辆
		 * @param car
		 * @return
		 */
		@PostMapping("addCar")
		public Map<String, Object> addCar(@RequestBody Rescuecar car) {
			int count=biz.addCar(car);
			Map<String, Object> message = new HashMap<String, Object>();
			if(count!=0) {
				message.put("code", "ok");
				message.put("msg", "新增成功!");
			}else {
				message.put("code", "300");
				message.put("msg", "新增失败！");
			}
			return message;
		}
		/**
		 * 根据状态编码查询状态信息
		 * @param sid状态编码
		 * @return
		 */
		@GetMapping("queryCarBySid/{sid}")
		public Rescuecar queryCarBySid(@PathVariable int sid) {
			return biz.queryCarBySid(sid);
		}
		
		/**
		 * 移除车辆
		 * @param sid状态编码
		 * @return
		 */
		@DeleteMapping("deleteCar/{sid}")
		public Map<String, Object> deleteCar(@PathVariable int sid) {
			int count=biz.deleteCar(sid);
			Map<String, Object> message = new HashMap<String, Object>();
			if(count!=0) {
				message.put("code", "200");
				message.put("msg", "删除成功!");
			}else {
				message.put("code", "300");
				message.put("msg", "删除失败!");
			}
			return message;
		}
		/**
		 * 修改车辆
		 * @param star
		 * @return
		 */
		@PutMapping("modifCar")
		public Map<String, Object> modifStar(@RequestBody Rescuecar car) {
			int count=biz.modifCar(car);
			Map<String, Object> message = new HashMap<String, Object>();
			if(count!=0) {
				message.put("code", "ok");
				message.put("msg", "修改成功!");
			}else {
				message.put("code", "300");
				message.put("msg", "修改失败！");
			}
			return message;
		}
}
