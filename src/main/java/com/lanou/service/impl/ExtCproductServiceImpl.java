package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.entity.Extcproductc;
import com.lanou.mapper.ExtcproductcMapper;
import com.lanou.service.ExtCproductService;
@Transactional
@Service
public class ExtCproductServiceImpl implements ExtCproductService {
	
	@Resource
	public ExtcproductcMapper extcproductcMapper;

	@Override
	public List<Extcproductc> selectByContractProductId(String ContractProductId) {
		// TODO Auto-generated method stub
		return extcproductcMapper.selectByContractProductId(ContractProductId);
	}

	@Override
	public int deleteByPrimaryKey(String EXT_CPRODUCT_ID) {
		// TODO Auto-generated method stub
		return extcproductcMapper.deleteByPrimaryKey(EXT_CPRODUCT_ID);
	}

	@Override
	public int insertSelective(Extcproductc record) {
		// TODO Auto-generated method stub
		return extcproductcMapper.insertSelective(record);
	}

	@Override
	public Extcproductc selectByPrimaryKey(String EXT_CPRODUCT_ID) {
		// TODO Auto-generated method stub
		return extcproductcMapper.selectByPrimaryKey(EXT_CPRODUCT_ID);
	}

	@Override
	public int updateByPrimaryKeySelective(Extcproductc record) {
		// TODO Auto-generated method stub
		return extcproductcMapper.updateByPrimaryKeySelective(record);
	}
	
}
