/*package com.lanou.test;

import java.io.Serializable;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.lanou.bean.ContractBean;
import com.lanou.bean.OutProductBean;
import com.lanou.bean.PageBean;
import com.lanou.entity.Factoryc;
import com.lanou.mapper.ContractcMapper;
import com.lanou.mapper.FactorycMapper;
import com.lanou.service.FactoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-mybatis.xml"})
public class Test01 implements Serializable{

	@Autowired
	public FactoryService f;
	@Autowired
	public ContractcMapper contractcMapper;
	

	

	
	@Test
	public void select() {
		
		Factoryc key = f.selectByPrimaryKey("34");
		System.out.println(key.getCNOTE());
		Factoryc key2 = f.selectByPrimaryKey("34");
		System.out.println(key2.getCNOTE());
		
	}
	@Test
	public void selectAll() {
		List<OutProductBean> list = contractcMapper.selectOutproduct("2011-12");
		
		String json = JSON.toJSONString(list);
		System.out.println(json);
		
		
	}
	

}
*/