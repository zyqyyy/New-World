package com.lanou.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lanou.entity.Packinglistc;
import com.lanou.service.ExportService;
import com.lanou.service.PackingListService;

@Controller
@RequestMapping("/packinglist")
public class PackingListController {
	@Resource
	private PackingListService packingListService;
	@Resource
	private ExportService exportService;
	
	
	//进入装箱单首页
	@RequestMapping("/jPackingListList")
	public ModelAndView packingList() {
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListList");
		List<Packinglistc> list = packingListService.selectPackingAll();
		m.addObject("dataList",list);
		return m;
	}
	
	//查看装箱单
	@RequestMapping("/PackingListView")
	public String toPackingListView(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		Packinglistc key = packingListService.selectByPrimaryKey(id);
		request.setAttribute("divData", key.getEXPORT_NOS());
		request.setAttribute("obj", key);
		return "cargo/packinglist/jPackingListView";
		
	}
	
	//进入修改页面
	@RequestMapping("/toPackingListUpdate")
	public ModelAndView toUpdate(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		Packinglistc key = packingListService.selectByPrimaryKey(id);
		request.setAttribute("divData", key.getEXPORT_NOS());
		ModelAndView m = new ModelAndView("cargo/packinglist/jPackingListUpdate");
		m.addObject("obj", key);
		return m;
		
	}
	//修改装箱单
	@RequestMapping("/packingListUpdate")
	public String PackingListUpdate(HttpServletRequest request,Packinglistc record) {
		
		String packinglistid = request.getParameter("packinglistid");
		record.setPACKING_LIST_ID(packinglistid);
		int i = packingListService.updateByPrimaryKeySelective(record);
		if (i>0) {
			
			return "redirect:/packinglist/jPackingListList";
		}else {
			
			return "cargo/packinglist/jPackingListUpdate";
		}
		
	}
	//批量删除装箱单
	@RequestMapping("/delete")
	public ModelAndView deletePacking(String[] id) {
		
		
		for (String s : id) {
			//根据装箱单id查询装箱单
			Packinglistc key = packingListService.selectByPrimaryKey(s);

			if (key.getEXPORT_IDS()!=null) {
				String[] ids = key.getEXPORT_IDS().split(" ");
				exportService.deleteByPrimaryKey(ids);
			}
			
			
			
		}
		
		int i = packingListService.deleteByPrimaryKey(id);
		ModelAndView m =null;
		if (i>0) {
			m =  new ModelAndView(new RedirectView("jPackingListList"));
		}
		return m;
		
		
	}
	
	//上报 修改状态
	
	@RequestMapping("/update")
	public String updateStute(String[] id) {
		
		
		if (id==null) {
			return "redirect:/packinglist/jPackingListList";
		}else {
		
		packingListService.update(id);
		
		return "redirect:/packinglist/jPackingListList";
		}
		
	}
	
	
	
	
	

	
	

}
