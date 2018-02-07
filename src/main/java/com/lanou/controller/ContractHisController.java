package com.lanou.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanou.entity.Contracthisc;
import com.lanou.entity.Contractproducthisc;
import com.lanou.entity.Extcproducthisc;
import com.lanou.mapper.ContractproducthiscMapper;
import com.lanou.mapper.ExtcproducthiscMapper;
import com.lanou.service.ContractHisService;

@Controller
public class ContractHisController {
	
	@Resource
	private ContractHisService contractHisService;
	@Resource
	private ContractproducthiscMapper contractproducthiscMapper;
	@Resource
	private ExtcproducthiscMapper extcproducthiscMapper;
	
	
	//查看合同历史列表
	@RequestMapping("/contracthis/toContractList")
	public ModelAndView toList() {
		ModelAndView m = new ModelAndView("/cargo/contracthis/jContractList");
		m.addObject("dataList", contractHisService.selectAll());
		
		return m;
		
	}
	
	//进入查看页面
	@RequestMapping("/contracthis/toView")
	public ModelAndView toView(String id) {
		
		ModelAndView m = new ModelAndView("/cargo/contracthis/jContractView");
		Contracthisc ct = contractHisService.selectByPrimaryKey(id);
		List<Contractproducthisc> list = contractproducthiscMapper.selectAllList(ct.getCONTRACT_ID());
		List<Extcproducthisc> list2 = new ArrayList<>();
		for (Contractproducthisc c : list) {
			list2.addAll(extcproducthiscMapper.selectByList(c.getCONTRACT_PRODUCT_ID()));
		}
		
		
		m.addObject("contractProducts", list);
		m.addObject("extCproducts", list2);
		m.addObject("obj", ct);
		return m;
	}
	
	//删除
	@RequestMapping("/contracthis/delete")
	public String delete(String[] id) {
		
		for (String s : id) {
			List<Contractproducthisc> list = contractproducthiscMapper.selectAllList(s);
			
			if (list!=null) {
				for (Contractproducthisc c : list) {
					contractproducthiscMapper.deleteByPrimaryKey(c.getCONTRACT_PRODUCT_ID());
					List<Extcproducthisc> list2 = extcproducthiscMapper.selectByList(c.getCONTRACT_PRODUCT_ID());
					if (list2!=null) {
						for (Extcproducthisc e : list2) {
							extcproducthiscMapper.deleteByPrimaryKey(e.getEXT_CPRODUCT_ID());
						}
					}
				}
			}
			contractHisService.deleteByPrimaryKey(s);
		}
		
		
		return "redirect:/contracthis/toContractList";
		
	}
}
