package com.lanou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lanou.entity.Extcproductc;

public interface ExtCproductService {

	/**
	 * 根据合同货物id查询附件
	 * @param ContractProductId
	 * @return
	 */
	List<Extcproductc> selectByContractProductId(@Param("ContractProductId")String ContractProductId);
	
	/**
	 * 根据附件id删除附件
	 * @param EXT_CPRODUCT_ID
	 * @return
	 */
    int deleteByPrimaryKey(String EXT_CPRODUCT_ID);

    /**
     * 动态添加
     * @param record
     * @return
     */
    int insertSelective(Extcproductc record);
    /**
     * 根据附件id查询附件
     * @param EXT_CPRODUCT_ID
     * @return
     */
    Extcproductc selectByPrimaryKey(String EXT_CPRODUCT_ID);
    /**
     * 动态修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Extcproductc record);

}
