package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.lanou.bean.ContractBean;
import com.lanou.entity.Contracthisc;
import com.lanou.mapper.ContracthiscMapper;
import com.lanou.service.HelloService;
@Service
@WebService(endpointInterface="com.lanou.service.HelloService",serviceName="HelloService")
public class HelloServiceImpl implements HelloService {

	@Resource
	private ContracthiscMapper contracthiscMapper;
	
	@Override
	public void sayHi(String text) {
		System.out.println("hello,"+text);

	}

	@Override
	public Contracthisc selectByPrimaryKey(String CONTRACT_ID) {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectByPrimaryKey(CONTRACT_ID);
	}

	@Override
	public Contracthisc selectByMax() {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectByMax();
	}

	@Override
	public List<Contracthisc> selectByTime(String time) {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectByTime(time);
	}

	@Override
	public List<Contracthisc> selectByYear(String year) {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectByYear(year);
	}

	@Override
	public List<ContractBean> selectAll() {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectAll();
	}

	@Override
	public List<Contracthisc> selectByFactoryName(String factoryName) {
		// TODO Auto-generated method stub
		return contracthiscMapper.selectByFactoryName(factoryName);
	}

}
