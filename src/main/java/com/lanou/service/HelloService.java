package com.lanou.service;

import java.util.List;

import javax.jws.WebService;

import com.lanou.bean.ContractBean;
import com.lanou.entity.Contracthisc;

@WebService
public interface HelloService {

	public void sayHi(String text);
	
	List<ContractBean> selectAll();
   
  
	
	/**
	 * 根据历史合同id查询对象
	 * 
	 * @param CONTRACT_ID
	 * @return
	 */
	Contracthisc selectByPrimaryKey(String CONTRACT_ID);

	/**
	 * 查询总金额最大的合同信息
	 * 
	 * @return
	 */
	Contracthisc selectByMax();
	/**
	 * 查询近几个月的合同列表
	 * @param time
	 * @return
	 */
	List<Contracthisc> selectByTime(String time);
	/**
	 * 根据年份查询合同列表
	 * @param year
	 * @return
	 */
	List<Contracthisc> selectByYear(String year);
	
	/**
	 * 根据厂家名称查合同
	 * @param factoryName
	 * @return
	 */
	List<Contracthisc> selectByFactoryName(String factoryName);

}
