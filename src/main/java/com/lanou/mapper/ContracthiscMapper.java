package com.lanou.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.bean.ContractBean;
import com.lanou.entity.Contractc;
import com.lanou.entity.Contracthisc;

@MapperScan
public interface ContracthiscMapper {

	List<ContractBean> selectAll();

	/**
	 * 根据合同历史删除合同
	 * 
	 * @param CONTRACT_ID
	 * @return
	 */
	int deleteByPrimaryKey(String CONTRACT_ID);

	/**
	 * 添加合同历史
	 * 
	 * @param record
	 * @return
	 */
	int insert(Contracthisc record);

	/**
	 * 动态添加合同
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Contractc record);


	/**
	 * 动态修改
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Contracthisc record);

	/**
	 * 修改
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(Contracthisc record);

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