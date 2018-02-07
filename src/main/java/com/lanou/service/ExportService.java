package com.lanou.service;

import java.util.List;

import com.lanou.bean.ExportBean;
import com.lanou.entity.Exportc;

public interface ExportService {
	
	/**
	 * 查询所有的报运单
	 * 
	 * @return
	 */
	List<ExportBean> selectByExport();

	/**
	 * 根据id批量删除报运单
	 * 
	 * @param EXPORT_ID
	 * @return
	 */
	int deleteByPrimaryKey(String[] id);

	/**
	 * 动态添加
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Exportc record);

	/**
	 * 根据报运单id查询报运单
	 * 
	 * @param EXPORT_ID
	 * @return
	 */
	Exportc selectByPrimaryKey(String EXPORT_ID);

	/**
	 * 动态修改
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Exportc record);
	
	/**
	 * 根据id修改状态
	 * @param id
	 * @return
	 */
	int updateState(String[] id);

}
