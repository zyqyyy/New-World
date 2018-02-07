package com.lanou.service;

import java.util.List;

import com.lanou.bean.FactoryRecordBean;
import com.lanou.entity.LoginLogp;

public interface LoginLogpService {
	
	
	 int insertSelective(LoginLogp record);
	 
	 List<FactoryRecordBean> selectByTime();
	 
	 List<FactoryRecordBean> selectByYear(String year);

}
