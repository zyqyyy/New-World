package com.lanou.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;

import com.lanou.bean.PageBean;
import com.lanou.entity.Factoryc;

public interface FactoryService {
	
    /**
     * 动态插入
     * @param record
     * @return
     */
    int insertSelective(Factoryc record);
    
    /**
     * 根据id 查询信息
     * @param FACTORY_ID
     * @return
     */
    Factoryc selectByPrimaryKey(String FACTORY_ID);
    /**
     * 查询所有
     * @return
     */
    List<Factoryc> selectAll();
    
    /**
     * 分页查询
     */

    public PageBean<Factoryc> pageFactory(int type,String condition,int pageNo,int pageSize);
    /**
     * 动态修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Factoryc record);
    /**
	 * 根据id删除工厂
	 * @param FACTORY_ID
	 * @return
	 */
    int deleteByPrimaryKey(String FACTORY_ID);

}
