package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.bean.FactoryRecordBean;
import com.lanou.entity.Contractproductc;
import com.lanou.mapper.ContractproductcMapper;
import com.lanou.service.ContractProductService;
@Transactional
@Service
public class ContractProductServiceImpl implements ContractProductService {

	@Resource
	public ContractproductcMapper contractproductcMapper;
	@Override
	public List<Contractproductc> selectByContractId(String ContractId) {
		// TODO Auto-generated method stub
		return contractproductcMapper.selectByContractId(ContractId);
	}
	@Override
	public List<Contractproductc> selectByFactory() {
		// TODO Auto-generated method stub
		return contractproductcMapper.selectByFactory();
	}
	@Override
	public int insertSelective(Contractproductc record) {
		// TODO Auto-generated method stub
		return contractproductcMapper.insertSelective(record);
	}
	@Override
	public Contractproductc selectFactoryName(String factoryid) {
		// TODO Auto-generated method stub
		return contractproductcMapper.selectFactoryName(factoryid);
	}
	@Override
	public int deleteByPrimaryKey(String CONTRACT_PRODUCT_ID) {
		// TODO Auto-generated method stub
		return contractproductcMapper.deleteByPrimaryKey(CONTRACT_PRODUCT_ID);
	}
	@Override
	public Contractproductc selectByPrimaryKey(String CONTRACT_PRODUCT_ID) {
		// TODO Auto-generated method stub
		return contractproductcMapper.selectByPrimaryKey(CONTRACT_PRODUCT_ID);
	}
	@Override
	public int updateByPrimaryKeySelective(Contractproductc record) {
		// TODO Auto-generated method stub
		return contractproductcMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public List<FactoryRecordBean> selectProduct() {
		// TODO Auto-generated method stub
		return contractproductcMapper.selectProduct();
	}

}
