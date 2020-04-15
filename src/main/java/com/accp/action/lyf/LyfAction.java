package com.accp.action.lyf;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lyf.LyfCheliangpinpaiBiz;
import com.accp.biz.lyf.LyfChexingBiz;
import com.accp.biz.lyf.LyfClzlBiz;
import com.accp.biz.lyf.LyfKhzlBiz;
import com.accp.biz.lyf.LyfShengBiz;
import com.accp.biz.lyf.LyfShiquBiz;
import com.accp.pojo.Addressinfo;
import com.accp.pojo.Carbrand;
import com.accp.pojo.Consumercar;
import com.accp.pojo.Consumerinfo;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Province;
import com.accp.vo.lyf.LyfClzlVo;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@RestController
@RequestMapping("/api/LyfKhzlAction")
public class LyfAction {
	@Autowired
	private LyfKhzlBiz lyfkhzlbiz;
	@Autowired
	private LyfClzlBiz lyfclzlbiz;
	@Autowired
	private LyfShengBiz lyfshengbiz;
	@Autowired
	private LyfShiquBiz lyfshiqubiz;
	@Autowired
	private LyfCheliangpinpaiBiz lyfcheliangpinpaibiz;
	@Autowired
	private LyfChexingBiz lyfchexingbiz;
	@GetMapping()
	public List<Consumerinfo> khzl() {
		return lyfkhzlbiz.khzl();
	}
	@GetMapping("xuanzhongconsumerinfochache/{userid}")
	public List<LyfClzlVo> clzl(@PathVariable String userid) {
		return lyfclzlbiz.clzl(userid);
	}
	@GetMapping("sheng")
	public List<Province> sheng() {
		return lyfshengbiz.sheng();
	}
	@GetMapping("shiqu/{id}")
	public List<Addressinfo> shiqu(@PathVariable String id) {
		return lyfshiqubiz.shiqu(id);
	}
	@GetMapping("cheliangpinpai")
	public List<Carbrand> cheliangpinpai() {
		return lyfcheliangpinpaibiz.cheliangpinpai();
	}
	@GetMapping("chexing/{id}")
	public List<Motorcycle> chexing(@PathVariable String id) {
		return lyfchexingbiz.chexing(id);
	}
	@PostMapping("addkehu")
	public Map<String, Object> addkehu(@RequestBody Consumerinfo kehu) {
		System.out.println(kehu.getUserid());
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfkhzlbiz.addkehu(kehu);
		if(count>0) {
			message.put("code", "200");
			message.put("msg", "新增成功");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败");
		}
		return message;
	}
	@PostMapping("addkehuche")
	public Map<String, Object> addkehuche(@RequestBody Consumercar kehuche) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count1=lyfclzlbiz.addkehuche(kehuche);
		if(count1>0) {
			message.put("code", "200");
			message.put("msg", "新增成功");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败");
		}
		return message;
	}
	@PostMapping("xiugaikehu")
	public Map<String, Object> xiugaikehu(@RequestBody Consumerinfo kehu) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfkhzlbiz.xiugaikehu(kehu);
		if(count>0) {
			message.put("code", "200");
			message.put("msg", "修改成功");
		}else {
			message.put("code", "300");
			message.put("msg", "修改失败");
		}
		return message;
	}
	@PostMapping("xiugaikehuche")
	public Map<String, Object> xiugaikehuche(@RequestBody Consumercar kehuche) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count1=lyfclzlbiz.xiugaikehuche(kehuche);
		if(count1>0) {
			message.put("code", "200");
			message.put("msg", "修改成功");
		}else {
			message.put("code", "300");
			message.put("msg", "修改失败");
		}
		return message;
	}
	@DeleteMapping("shanchukehu/{userid}")
	public Map<String, Object> shanchukehu(@PathVariable String userid) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfkhzlbiz.shanchukehu(userid);
		lyfclzlbiz.shanchukehu(userid);
		if(count>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败");
		}
		return message;
	}
	@DeleteMapping("shanchukehuche/{consumerid}")
	public Map<String, Object> shanchukehuche(@PathVariable Integer consumerid) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfclzlbiz.shanchukehuche(consumerid);
		if(count>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败");
		}
		return message;
	}
	@GetMapping("clzl")
	public List<LyfClzlVo> clzl() {
		return lyfclzlbiz.chelianziliao();
	}
	@GetMapping("xuanzhongchechakehu/{userid}")
	public List<Consumerinfo> khzl(@PathVariable String userid) {
		return lyfkhzlbiz.khzl(userid);
	}
	@GetMapping("chachepai/{chepai}")
	public List<LyfClzlVo> chachepai(@PathVariable String chepai) {
		return lyfclzlbiz.chachepai(chepai);
	}
	@GetMapping("cxdaqcpp")
	public List<Carbrand> cxdaqcpp() {
		return lyfcheliangpinpaibiz.cxdaqcpp();
	}
	@PostMapping("addpinpai")
	public Map<String, Object> addpinpai(@RequestBody Carbrand pinpai) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfcheliangpinpaibiz.addpinpai(pinpai);
		if(count>0) {
			message.put("code", "200");
			message.put("msg", "新增成功");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败");
		}
		return message;
	}
	@PostMapping("xiugaipinpai")
	public Map<String, Object> xiugaipinpai(@RequestBody Carbrand pinpai) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfcheliangpinpaibiz.xiugaipinpai(pinpai);
		if(count>0) {
			message.put("code", "200");
			message.put("msg", "修改成功");
		}else {
			message.put("code", "300");
			message.put("msg", "修改失败");
		}
		return message;
	}
	@DeleteMapping("shanpinpai/{brandid}")
	public Map<String, Object> shanpinpai(@PathVariable Integer brandid) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfcheliangpinpaibiz.shanpinpai(brandid);
		lyfchexingbiz.shanchexing(brandid);
		if(count>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败");
		}
		return message;
	}
	@GetMapping("chachexing/{brandid}")
	public List<Motorcycle> chachexing(@PathVariable int brandid) {
		return lyfchexingbiz.chachexing(brandid);
	}
	@PostMapping("addchexing")
	public Map<String, Object> addchexing(@RequestBody Motorcycle chexing) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfchexingbiz.addchexing(chexing);
		if(count>0) {
			message.put("code", "200");
			message.put("msg", "新增成功");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败");
		}
		return message;
	}
	@PostMapping("xgchexing")
	public Map<String, Object> xgchexing(@RequestBody Motorcycle chexing) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfchexingbiz.xgchexing(chexing);
		if(count>0) {
			message.put("code", "200");
			message.put("msg", "修改成功");
		}else {
			message.put("code", "300");
			message.put("msg", "修改失败");
		}
		return message;
	}
	@DeleteMapping("shanchexing/{motorcycleid}")
	public Map<String, Object> shanchexing(@PathVariable Integer motorcycleid) {
		Map<String, Object> message = new HashMap<String, Object>();
		int count=lyfchexingbiz.shanchexing1(motorcycleid);
		if(count>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败");
		}
		return message;
	}
	@GetMapping("daochukhzl")
	public Map<String, Object> daochukhzl() {
		Map<String, Object> message = new HashMap<String, Object>();
		List<Consumerinfo> kehuziliao=lyfkhzlbiz.khzl();
		List<String[]> data = new ArrayList<String[]>();
		for(int i=0;i<kehuziliao.size();i++) {
			data.add(new String[] {
					String.valueOf(kehuziliao.get(i).getUserid()),
					String.valueOf(kehuziliao.get(i).getUsername()),
					String.valueOf(kehuziliao.get(i).getUserphone()),
					String.valueOf(kehuziliao.get(i).getUseraddress()),
					String.valueOf(kehuziliao.get(i).getUserbrithday()),
					String.valueOf(kehuziliao.get(i).getUserremark()),
			});
		}
		String fileName = "客户资料";
		try {
			WritableWorkbook wbook = Workbook
					.createWorkbook(new FileOutputStream("E:\\Y2java\\导出Excel"+"/"+fileName + ".xls")); // 建立excel文件
			WritableSheet wsheet = wbook.createSheet("导出数据", 0); // sheet名称
			WritableCellFormat cellFormatNumber = new WritableCellFormat();
			cellFormatNumber.setAlignment(Alignment.RIGHT);
			WritableFont wf = new WritableFont(WritableFont.ARIAL, 12,
					WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
					jxl.format.Colour.BLACK); // 定义格式、字体、粗体、斜体、下划线、颜色
			WritableCellFormat wcf = new WritableCellFormat(wf); // title单元格定义
			WritableCellFormat wcfc = new WritableCellFormat(); // 一般单元格定义
			WritableCellFormat wcfe = new WritableCellFormat(); // 一般单元格定义
			wcf.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			wcfc.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式

			wcf.setBorder(jxl.format.Border.ALL,
					jxl.format.BorderLineStyle.THIN);
			wcfc.setBorder(jxl.format.Border.ALL,
					jxl.format.BorderLineStyle.THIN);
			wcfe.setBorder(jxl.format.Border.ALL,
					jxl.format.BorderLineStyle.THIN);

			wsheet.setColumnView(0, 20);// 设置列宽
			wsheet.setColumnView(1, 10);
			wsheet.setColumnView(2, 20);

			int rowIndex = 0;
			int columnIndex = 0;
			if (null != data) {
				// rowIndex++;
				columnIndex = 0;
				wsheet.setRowView(rowIndex, 500);// 设置标题行高
				wsheet.addCell(new Label(columnIndex++, rowIndex, fileName, wcf));
				wsheet.mergeCells(0, rowIndex,  6, rowIndex);// 合并标题所占单元格
				rowIndex++;
				columnIndex = 0;
				wsheet.setRowView(rowIndex, 380);// 设置项目名行高
				wsheet.addCell(new Label(columnIndex++, rowIndex, "用户编号", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "姓名", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "电话", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "地址", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "生日", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "备注", wcf));
				// 开始行循环
				for (String[] array : data) { // 循环列
					rowIndex++;
					columnIndex = 0;
					for(int j=0;j<6;j++) {
						wsheet.addCell(new Label(columnIndex++, rowIndex, array[j],wcfe));
					}
				}
				rowIndex++;
				columnIndex = 0;
			}
			wbook.write();
			if (wbook != null) {
				wbook.close();
			}
			message.put("code", "200");
			message.put("msg", "导出成功");
			return message;
		} catch (Exception e) {
			message.put("code", "300");
			message.put("msg", "导出失败");
			return message;
		}
	}
}
