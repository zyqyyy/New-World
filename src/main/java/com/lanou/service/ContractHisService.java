package com.lanou.service;

import java.util.List;

import com.lanou.bean.ContractBean;
import com.lanou.entity.Contracthisc;

public interface ContractHisService {

	
	List<ContractBean> selectAll();
    /**
     * 合同搬家到合同历史
     * @param ids
     */
    public void banjia(String[] contractId);
    /**
     * 根据历史合同id查询对象
     * @param CONTRACT_ID
     * @return
     */
    Contracthisc selectByPrimaryKey(String CONTRACT_ID);
    /**
     * 根据合同历史删除合同
     * @param CONTRACT_ID
     * @return
     */
    int deleteByPrimaryKey(String CONTRACT_ID);
    
    
}
