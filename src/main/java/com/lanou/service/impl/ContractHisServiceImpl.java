package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.bean.ContractBean;
import com.lanou.entity.Contractc;
import com.lanou.entity.Contracthisc;
import com.lanou.entity.Contractproductc;
import com.lanou.entity.Contractproducthisc;
import com.lanou.entity.Extcproductc;
import com.lanou.entity.Extcproducthisc;
import com.lanou.entity.Exteproductc;
import com.lanou.mapper.ContractcMapper;
import com.lanou.mapper.ContracthiscMapper;
import com.lanou.mapper.ContractproductcMapper;
import com.lanou.mapper.ContractproducthiscMapper;
import com.lanou.mapper.ExtcproductcMapper;
import com.lanou.mapper.ExtcproducthiscMapper;
import com.lanou.mapper.ExteproductcMapper;
import com.lanou.service.ContractHisService;
@Service
public class ContractHisServiceImpl implements ContractHisService {

	@Resource
	private ContracthiscMapper contracthiscMapper;
	@Resource
	private ContractcMapper contractcMapper;
	@Resource
	private ContractproductcMapper contractproductcMapper;
	@Resource
	private ContractproducthiscMapper contractproducthiscMapper;
	@Resource
	private ExtcproductcMapper extcproductcMapper;
	@Resource
	private ExtcproducthiscMapper extcproducthiscMapper;


	@Override
	public void banjia(String[] contractId) {
		
		//根据合同的id数组遍历查询合同的信息
		for (String s : contractId) {
			Contractc contractc = contractcMapper.selectByPrimaryKey(s);
			
			//将合同对象添加到合同历史中
			contracthiscMapper.insertSelective(contractc);
			
			List<Contractproductc> list = contractproductcMapper.selectByContractId(s);
			
			for (Contractproductc cp : list) {
				
				contractproducthiscMapper.insertSelective(cp);
				
				List<Extcproductc> list2 = extcproductcMapper.selectByContractProductId(cp.getCONTRACT_PRODUCT_ID());
				for (Extcproductc ept : list2) {
					extcproducthiscMapper.insertSelective(ept);
				}
			}
		}
	}


	@Override
	public List<ContractBean> selectAll() {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectAll();
	}


	@Override
	public Contracthisc selectByPrimaryKey(String CONTRACT_ID) {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectByPrimaryKey(CONTRACT_ID);
	}


	@Override
	public int deleteByPrimaryKey(String CONTRACT_ID) {
		// TODO Auto-generated method stub
		return contracthiscMapper.deleteByPrimaryKey(CONTRACT_ID);
	}
	
	
	



}
