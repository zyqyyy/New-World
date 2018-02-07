package com.lanou.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lanou.bean.PageBean;
import com.lanou.entity.Factoryc;
import com.lanou.service.FactoryService;
import com.lanou.util.Constants;
import com.lanou.util.ExcelUtil;

import org.springframework.util.StringUtils;

@Controller
@RequestMapping("/fac")
public class FactoryController {
	
	
	@Resource
	public FactoryService factoryService;
	
	@RequestMapping("/list")
	public ModelAndView selectAll(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView("baseinfo/factory/jFactoryList");
		//1:获取列表信息
				String f_type  = request.getParameter("f_type");
				int type = -1;
				if (!StringUtils.isEmpty(f_type)) {
					type = Integer.parseInt(f_type.trim());
				}
				String f_conditionStr = request.getParameter("f_conditionStr");
				if (f_conditionStr!=null) {
					f_conditionStr=f_conditionStr.trim();
				}
				String pageNo = request.getParameter("pageNo");
				String pageSize = request.getParameter("pageSize");
				int number = 1;
				if (!StringUtils.isEmpty(pageNo)) {
					number = Integer.parseInt(pageNo);
				}
				int size = Constants.PAGESIZE;
				if (!StringUtils.isEmpty(pageSize)) {
					size = Integer.parseInt(pageSize);
				}
		
		PageBean<Factoryc> dataList = factoryService.pageFactory(type, f_conditionStr, number,size);
		model.addObject("dataList", dataList.getList());
		model.addObject("pageNo",dataList.getPageNo());
		model.addObject("pageSize", dataList.getPageSize());
		model.addObject("totalCount", dataList.getTotalCount());
		model.addObject("totalPage", dataList.getTotalPage());
		
		model.addObject("f_type", f_type);
		model.addObject("f_conditionStr", f_conditionStr); 
		
		model.addObject("pageArray", new int[] {10,50,100});
		
		return model;
		
	}
	
	@RequestMapping(value="/factory/Detail")
	public ModelAndView SelectById(HttpServletRequest request) {
		
		String id_selector = request.getParameter("id");
			Factoryc  factory = factoryService.selectByPrimaryKey(id_selector);
		
		request.setAttribute("obj", factory);
		ModelAndView model = new ModelAndView("baseinfo/factory/jFactoryDetail");
		
		return model;
		
	}
	/**
	 * 跳转到添加页面
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/create")
	public String toadd() {

		return "baseinfo/factory/jFactoryCreate";
	}
	/**
	 * 添加
	 * @param f
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/insert.action")
	public String add(Factoryc f) {
		
		f.setSTATE("1");
		f.setCREATE_TIME(new Date());
		int row = factoryService.insertSelective(f);
		if (row > 0) {
			return "redirect:/fac/list";
		}
		return "baseinfo/factory/jFactoryCreate";
	}
	/**
	 * 跳转到修改页面
	 * @param request
	 * @return
	 */
	@RequestMapping("/baseinfo/factory/update")
	public String toupdate(HttpServletRequest request) {
		
		String id_selector = request.getParameter("id");
		Factoryc  factory = factoryService.selectByPrimaryKey(id_selector);
		request.setAttribute("obj", factory);
		
		return "baseinfo/factory/jFactoryUpdate";
	}
	/**
	 * 修改
	 * @param req
	 * @param f
	 * @return
	 */
	@RequestMapping("/update")
	public String update(HttpServletRequest req, Factoryc f) {
		
		f.setFACTORY_ID(req.getParameter("id"));
		int i = factoryService.updateByPrimaryKeySelective(f);
		if (i>0) {
			return "redirect:/fac/list";
		}
		return "baseinfo/factory/jFactoryUpdate";
	}
	
	/**
	 * 删除
	 * @param req
	 * @param f
	 * @return
	 */
	@RequestMapping("/basicinfo/factory/delete")
	public String delete(HttpServletRequest req, String[] id) {
		int i =0;
		for (String s : id) {
			i= factoryService.deleteByPrimaryKey(s);
		}
		
		
		if (i>0) {
			return "redirect:/fac/list";
		}
		return "redirect:/fac/list";
		
	}
	/**
	 * 导出Excel
	 * @param request
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping("/factory/exportExcel")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {

		//1:获取列表信息
		String f_type  = request.getParameter("f_type");
		int type = -1;
		if (!StringUtils.isEmpty(f_type)) {
			type = Integer.parseInt(f_type.trim());
		}
		String f_conditionStr = request.getParameter("f_conditionStr");
		String pageNo = request.getParameter("pageNo");
		String pageSize = request.getParameter("pageSize");
		int number = 1;
		if (!StringUtils.isEmpty(pageNo)) {
			number = Integer.parseInt(pageNo);
		}
		int size = Constants.PAGESIZE;
		if (!StringUtils.isEmpty(pageSize)) {
			size = Integer.parseInt(pageSize);
		}
		request.setAttribute("pNo", number);
		request.setAttribute("size", size);


		PageBean<Factoryc> page = factoryService.pageFactory(type, f_conditionStr, number,size);
		List<Factoryc> list = page.getList();

		Map<String, String> headMap = new HashMap<>();
		headMap.put("fACTORY_ID", "id");
		headMap.put("fULL_NAME", "全称");
		headMap.put("fACTORY_NAME", "简称");
		headMap.put("cONTACTS", "联系人");
		headMap.put("iNSPECTOR", "验货员");
		headMap.put("pHONE", "联系电话");
		System.out.println(JSON.toJSONString(list));
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(list));
		ExcelUtil.downloadExcelFile("工厂信息", headMap, jsonArray, response);
	}

	

	
}
