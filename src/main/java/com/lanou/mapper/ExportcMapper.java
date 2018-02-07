package com.lanou.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.bean.ExportBean;
import com.lanou.entity.Exportc;
@MapperScan
public interface ExportcMapper {
	
	
	/**
	 * 根据id修改状态
	 * @param id
	 * @return
	 */
	int updateState(String[] id);
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

	int updateByPrimaryKey(Exportc record);

	int insert(Exportc record);
}