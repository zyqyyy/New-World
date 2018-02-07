package com.lanou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.lanou.bean.ContractBean;
import com.lanou.bean.FactoryRecordBean;
import com.lanou.bean.OutProductBean;
import com.lanou.entity.Contractc;
@MapperScan
public interface ContractcMapper {
	
	/**
	 * 删除草稿
	 * @param id
	 * @return
	 */
	int delete(String id);
	
	/**
	 * 根据id修改状态
	 * @param id
	 * @return
	 */
	int updateState(String id);
	
	/**
	 * 一页显示的内容
	 * @return
	 */
	List<ContractBean> selectPageContract();
	/**
	 * 根据id删除合同
	 * @param CONTRACT_ID
	 * @return
	 */
    int deleteByPrimaryKey(String CONTRACT_ID);

    int insert(Contractc record);

    /**
     * 动态添加
     * @param record
     * @return
     */
    int insertSelective(Contractc record);
    /**
     * 根据id查询合同详情
     * @param CONTRACT_ID
     * @return
     */
    Contractc selectByPrimaryKey(String CONTRACT_ID);
    /**
     * 动态修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Contractc record);

    int updateByPrimaryKey(Contractc record);
    
    /**
     * 出货表月统计
     * @param shipTime
     * @return
     */
    List<OutProductBean> selectOutproduct(@Param("shipTime")String shipTime);
    /**
     * 厂家的销售记录
     * @return
     */
    List<FactoryRecordBean> selectFactoryLog();
    
    
}