package com.lanou.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.Packinglistc;
@MapperScan
public interface PackinglistcMapper {
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
    int deleteByPrimaryKey(String[] id);
    /**
     * 批量修改状态
     * @param record
     * @return
     */
    int update(String[] id);
    
    

    int insert(Packinglistc record);
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

    int updateByPrimaryKey(Packinglistc record);
}