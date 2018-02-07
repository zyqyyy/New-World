package com.lanou.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.Contractproductc;
import com.lanou.entity.Contractproducthisc;
@MapperScan
public interface ContractproducthiscMapper {
	/**
	 * 根据合同id查询货物
	 * @param id
	 * @return
	 */
	List<Contractproducthisc> selectAllList(String id);
    /**
     * 根据合同货物id删除合同货物
     * @param CONTRACT_PRODUCT_ID
     * @return
     */
    int deleteByPrimaryKey(String CONTRACT_PRODUCT_ID);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(Contractproducthisc record);

    /**
     * 动态添加
     * @param record
     * @return
     */
    int insertSelective(Contractproductc record);

    /**
     * 根据合同货物id查询合同货物
     * @param CONTRACT_PRODUCT_ID
     * @return
     */
    Contractproducthisc selectByPrimaryKey(String CONTRACT_PRODUCT_ID);

    /**
     * 动态修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Contractproducthisc record);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Contractproducthisc record);
}