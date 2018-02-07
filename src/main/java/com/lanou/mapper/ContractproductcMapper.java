package com.lanou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.lanou.bean.FactoryRecordBean;
import com.lanou.entity.Contractproductc;

@MapperScan
public interface ContractproductcMapper {

	/**
	 * 根据货物id查详情
	 * 
	 * @return
	 */
	List<Contractproductc> selectByContractId(@Param("ContractId") String ContractId);

	/**
	 * 查询工厂的信息
	 * @return
	 */
	List<Contractproductc> selectByFactory();
	/**
	 * 根据工厂id查询工厂名称
	 * @param CONTRACT_PRODUCT_ID
	 * @return
	 */
	Contractproductc selectFactoryName(@Param("factoryid") String factoryid);
	/**
	 * 根据商品id删除货物
	 * @param CONTRACT_PRODUCT_ID
	 * @return
	 */
	int deleteByPrimaryKey(String CONTRACT_PRODUCT_ID);

	int insert(Contractproductc record);
	/**
	 * 动态添加
	 * @param record
	 * @return
	 */
	int insertSelective(Contractproductc record);

	/**
	 * 根据商品id查询信息
	 * 
	 * @param CONTRACT_PRODUCT_ID
	 * @return
	 */
	Contractproductc selectByPrimaryKey(String CONTRACT_PRODUCT_ID);

	/**
	 * 动态修改
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Contractproductc record);

	int updateByPrimaryKey(Contractproductc record);
	/**
	 * 货物销售前十
	 * @return
	 */
	List<FactoryRecordBean> selectProduct();
}