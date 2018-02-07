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
import com.lanou.bean.OutProductBean;
import com.lanou.service.ContractService;
import com.lanou.util.ExcelUtil;

@Controller
public class OutProductController {
	
	@Resource
	private ContractService contractService;
	
	@RequestMapping("/contractproduct/OutProduct")
	public ModelAndView OutProduct(HttpServletRequest request) {
		
		ModelAndView m = new ModelAndView("cargo/contract/jOutProduct");
		String shipTime = request.getParameter("inputDate");
		List<OutProductBean> list = contractService.selectOutproduct(shipTime);
		m.addObject("dataList", list);
		
		return m;
		
	}
	//导出Excel出货月度统计
	@RequestMapping("/contractproduct/outProductPrint")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {


		String shipTime = request.getParameter("inputDate");
		List<OutProductBean> list = contractService.selectOutproduct(shipTime);
		System.out.println(list.size());
		Map<String, String> headMap = new HashMap<>();
		headMap.put("contract_product_id", "合同货物id");
		headMap.put("custom_name", "客户名称");
		headMap.put("contract_no", "合同编号");
		headMap.put("delivery_period", "交货日期");
		headMap.put("ship_time", "船期");
		headMap.put("trade_terms", "贸易条款");
		headMap.put("factory_name", "厂家名称");
		headMap.put("product_no", "货物编号");
		headMap.put("cnumber", "货物数量");
		
		System.out.println(JSON.toJSONString(list));
		JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(list));
		ExcelUtil.downloadExcelFile("出货表月统计", headMap, jsonArray, response);
	}

	

}
