package com.lanou.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.FactoryRecordBean;
import com.lanou.mapper.ContractcMapper;
import com.lanou.service.ContractProductService;
import com.lanou.service.LoginLogpService;

@Controller
public class ChatController {

	@Resource
	private ContractcMapper contractcMapper;
	@Resource
	private ContractProductService contractProductService;
	@Resource
	private LoginLogpService loginLogpService;
	
	@RequestMapping("/cargo/chat/factoryLog")
	public String factoryLog() {
		
		return "/cargo/chat/factoryLog";
	}
	@ResponseBody
	@RequestMapping("/cargo/chat/factoryRecord")
	public Object factoryRecord() {
		
		return contractcMapper.selectFactoryLog();
		
		
	}
	@RequestMapping("/cargo/chat/productLog")
	public String productLog() {
		return "/cargo/chat/productLog";
		
		
	}
	@ResponseBody
	@RequestMapping("/cargo/chat/productRecord")
	public Object productRecord() {
		
		return contractProductService.selectProduct();
		
		
	}
	
	@RequestMapping("/cargo/chat/loginLogTime")
	public String loginLogTime(HttpServletRequest request) {
		String year = request.getParameter("year");
		request.getSession().setAttribute("year", year);
		System.out.println(year+"-------------------------------------------------------------");
		List<FactoryRecordBean> list = loginLogpService.selectByTime();
		request.setAttribute("list", list);
		
		return "/cargo/chat/loginLogTime";
		
		
	}
	@ResponseBody
	@RequestMapping("/cargo/chat/loginLogTimeRecord")
	public Object loginLogTimeRecord(HttpServletRequest request) {
		String year = (String) request.getSession().getAttribute("year");
		System.out.println(year+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		if (year!=null&&year!="") {
			return loginLogpService.selectByYear(year);	
		}else {
		
		return loginLogpService.selectByTime();
		}
		
	}
	
	
	
	
	
	
}
