package com.lanou.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.Factoryc;
@MapperScan
public interface FactorycMapper {
	
	/**
	 * 批量删除
	 * @return
	 */
	int deleteAllFactory(@Param("id")String id);
	/**
	 * 查询所有
	 * @return
	 */
	List<Factoryc> selectAll();
	
	/**
	 * 根据id删除工厂
	 * @param FACTORY_ID
	 * @return
	 */
    int deleteByPrimaryKey(String FACTORY_ID);
    /**
     * 动态插入
     * @param record
     * @return
     */
    int insertSelective(Factoryc record);
    
    /**
     * 一页显示的内容
     * @param map
     * @return
     */
    List<Factoryc> selectPageByFactory(Map<String,Object> map);
    /**
     * 总条数
     * @param map
     * @return
     */
    int selectPageCount(Map<String,Object> map);
    /**
     * 根据id查询信息
     * @param FACTORY_ID
     * @return
     */
    Factoryc selectByPrimaryKey(String FACTORY_ID);
    /**
     * 动态修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Factoryc record);

    int updateByPrimaryKey(Factoryc record);
    int insert(Factoryc record);
}