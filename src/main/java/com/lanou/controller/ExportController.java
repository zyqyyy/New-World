package com.lanou.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lanou.bean.ExportBean;
import com.lanou.entity.Exportc;
import com.lanou.entity.Packinglistc;
import com.lanou.service.ExportService;
import com.lanou.service.PackingListService;
@RequestMapping("/export")
@Controller
public class ExportController {

	@Resource
	private ExportService exportService;
	@Resource
	private PackingListService packingListService;
	
	String[] ExportId;
	
	//进入报运单首页
	@RequestMapping("/toExportList")
	public String toExportList(HttpServletRequest request) {
		
		List<ExportBean> list = exportService.selectByExport();
		request.setAttribute("dataList", list);
		return "cargo/export/jExportList";
		
	}
	//进入报运单修改页面
	@RequestMapping("/toExportUpdate")
	public String toUpdate(HttpServletRequest request) {
		
		String exportId = request.getParameter("exportId");
		Exportc exportc = exportService.selectByPrimaryKey(exportId);
		request.setAttribute("obj", exportc);
		
		return "cargo/export/jExportUpdate";
		
		
	}
	//修改报运单
	@RequestMapping("/exportUpdate")
	public ModelAndView update(Exportc record,HttpServletRequest request) {
		
		String exportId = request.getParameter("exportId");
		Exportc exportc = exportService.selectByPrimaryKey(exportId);
		record.setEXPORT_ID(exportId);
		record.setSTATE(exportc.getSTATE());
		int i = exportService.updateByPrimaryKeySelective(record);
		ModelAndView m = null;
		if (i>0) {
			m = new ModelAndView(new RedirectView("toExportList"+"?exportId="+exportId));
		}
		
		return m;
		
		
	}
	//批量删除报运单
	@RequestMapping("/delete")
	public String delete(String[] id) {
		
		exportService.deleteByPrimaryKey(id);
		
		return "redirect:/export/toExportList";
		
		
	}
	
	//添加装箱单
	
	@RequestMapping("/tojPackingCreated")
	public String tojPackingCreated(String[] id ,HttpServletRequest request) {
		
		String NOS="";
		ExportId=id;
		for (String s : id) {
			Exportc e = exportService.selectByPrimaryKey(s);
			NOS +=e.getCUSTOMER_CONTRACT()+",";
		}
		request.setAttribute("divData", NOS);
		return "cargo/packinglist/jPackingListCreate";
	}
	
	//添加装箱单
	@RequestMapping("/add")
	public String add(Packinglistc p,HttpServletRequest request) {
	
		String NOS="";
		String str ="";
		for (String s : ExportId) {
			Exportc e = exportService.selectByPrimaryKey(s);
			NOS +=e.getCUSTOMER_CONTRACT()+",";
		}
		for (int i = 0; i < ExportId.length; i++) {
			str += ExportId[i]+" ";
		}
		
		exportService.updateState(ExportId);
		p.setEXPORT_NOS(NOS);
		p.setSTATE((short) 0);
		p.setEXPORT_IDS(str);
		p.setCREATE_TIME(new Date());
		
		packingListService.insertSelective(p);
		
		return "redirect:/packinglist/jPackingListList";
	
		}
	

	
	
	
}
