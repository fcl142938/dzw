package com.accp.action.px;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.px.PxBiz;
import com.accp.vo.px.PX;
import com.alibaba.fastjson.JSON;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
 
 @RestController
 @RequestMapping("api/px/xcl")
 public class CreateExcel {
	     @Autowired
		private PxBiz pbiz;
 
	
	     @GetMapping("{staffname}/{pageNum}/{pageSize}/{departmentname}/{positionname}")
	 	public Map<String, Object> daochukhzl(@PathVariable String staffname,@PathVariable Integer pageNum, @PathVariable Integer pageSize,@PathVariable String departmentname,@PathVariable String positionname) {
	    	 if("null".equals(staffname)) {
	 			staffname=null;
	 		}
	    	 if("null".equals(departmentname)) {
	 			departmentname=null;
	 		}
	 		if("null".equals(positionname)) {
	 			positionname=null;
	 		}
	 		Map<String, Object> message = new HashMap<String, Object>();
	 		 List<PX> p=pbiz.queryall(staffname, pageNum, pageSize, departmentname, positionname).getList();
	 		List<String[]> data = new ArrayList<String[]>();
	 		for(int i=0;i<p.size();i++) {
	 			
	 			data.add(new String[] {
					   
	 				
	 					String.valueOf(p.get(i).getStaffname()),
	 					String.valueOf(p.get(i).getStaffsex()),
	 					String.valueOf(p.get(i).getSaddress()),
	 					String.valueOf(p.get(i).getSstarttime()),
	 					String.valueOf(p.get(i).getStaffaccount()),
	 					String.valueOf(p.get(i).getPrice()),
	 			});
	 		}
	 		
	 		String fileName = "员工资料"+pageNum+"页";
	 		try {
	 			WritableWorkbook wbook = Workbook
	 					.createWorkbook(new FileOutputStream("E:\\dzw"+"/"+fileName + ".xls")); // 建立excel文件
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
	 				wsheet.addCell(new Label(columnIndex++, rowIndex, "姓名", wcf));
	 				wsheet.addCell(new Label(columnIndex++, rowIndex, "性别", wcf));
	 				wsheet.addCell(new Label(columnIndex++, rowIndex, "地址", wcf));
	 				wsheet.addCell(new Label(columnIndex++, rowIndex, "入职时间", wcf));
	 				wsheet.addCell(new Label(columnIndex++, rowIndex, "账号", wcf));
	 				wsheet.addCell(new Label(columnIndex++, rowIndex, "月薪", wcf));
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
