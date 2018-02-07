package com.lanou.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.bean.ContractBean;
import com.lanou.bean.FactoryRecordBean;
import com.lanou.bean.OutProductBean;
import com.lanou.entity.Contractc;
import com.lanou.mapper.ContractcMapper;
import com.lanou.service.ContractService;
@Service
@Transactional
public class ContractServiceImpl implements ContractService {

	@Resource
	private ContractcMapper contractcMapper;
	@Override
	public List<ContractBean> selectPageContract() {
		// TODO Auto-generated method stub
		return contractcMapper.selectPageContract();
	}
	@Override
	public int insertSelective(Contractc record) {
		// TODO Auto-generated method stub
		return contractcMapper.insertSelective(record);
	}
	@Override
	public Contractc selectByPrimaryKey(String CONTRACT_ID) {
		// TODO Auto-generated method stub
		return contractcMapper.selectByPrimaryKey(CONTRACT_ID);
	}
	@Override
	public int updateByPrimaryKeySelective(Contractc record) {
		// TODO Auto-generated method stub
		return contractcMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int deleteByPrimaryKey(String CONTRACT_ID) {
		// TODO Auto-generated method stub
		return contractcMapper.deleteByPrimaryKey(CONTRACT_ID);
	}
	@Override
	public List<OutProductBean> selectOutproduct(String shipTime) {


		return contractcMapper.selectOutproduct(shipTime);
	}
	@Override
	public int updateState(String id) {
		// TODO Auto-generated method stub
		return contractcMapper.updateState(id);
	}
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return contractcMapper.delete(id);
	}
	@Override
	public List<FactoryRecordBean> selectFactoryLog() {
		// TODO Auto-generated method stub
		return contractcMapper.selectFactoryLog();
	}

}
