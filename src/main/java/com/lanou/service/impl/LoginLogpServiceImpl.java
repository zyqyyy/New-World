package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.bean.FactoryRecordBean;
import com.lanou.entity.LoginLogp;
import com.lanou.mapper.LoginLogpMapper;
import com.lanou.service.LoginLogpService;
@Transactional
@Service
public class LoginLogpServiceImpl implements LoginLogpService{

	@Resource
	private LoginLogpMapper loginLogpMapper;

	@Override
	public int insertSelective(LoginLogp record) {
		// TODO Auto-generated method stub
		return loginLogpMapper.insertSelective(record);
	}

	@Override
	public List<FactoryRecordBean> selectByTime() {
		// TODO Auto-generated method stub
		return loginLogpMapper.selectByTime();
	}

	@Override
	public List<FactoryRecordBean> selectByYear(String year) {
		// TODO Auto-generated method stub
		return loginLogpMapper.selectByYear(year);
	}
	
}
