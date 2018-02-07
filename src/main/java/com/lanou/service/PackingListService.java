package com.lanou.service;

import java.util.List;

import com.lanou.entity.Packinglistc;

public interface PackingListService {
	
	/**
	 * 查询所有装箱单
	 * @return
	 */
	List<Packinglistc> selectPackingAll();
	/**
	 * 根据装箱单id删除
	 * @param PACKING_LIST_ID
	 * @return
	 */
    int deleteByPrimaryKey(String[] PACKING_LIST_ID);

    /**
     * 批量修改状态
     * @param record
     * @return
     */
    int update(String[] id);
    
    /**
     * 动态添加
     * @param record
     * @return
     */
    int insertSelective(Packinglistc record);
    /**
     * 根据装箱单id查询装箱单
     * @param PACKING_LIST_ID
     * @return
     */
    Packinglistc selectByPrimaryKey(String PACKING_LIST_ID);
    /**
     * 动态修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Packinglistc record);
    
    
    
}
