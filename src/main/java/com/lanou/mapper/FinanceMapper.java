package com.lanou.mapper;

import com.lanou.entity.Finance;

public interface FinanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FINANCE_C
     *
     * @mbg.generated Mon Jan 08 14:19:28 CST 2018
     */
    int deleteByPrimaryKey(String FINANCE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FINANCE_C
     *
     * @mbg.generated Mon Jan 08 14:19:28 CST 2018
     */
    int insert(Finance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FINANCE_C
     *
     * @mbg.generated Mon Jan 08 14:19:28 CST 2018
     */
    int insertSelective(Finance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FINANCE_C
     *
     * @mbg.generated Mon Jan 08 14:19:28 CST 2018
     */
    Finance selectByPrimaryKey(String FINANCE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FINANCE_C
     *
     * @mbg.generated Mon Jan 08 14:19:28 CST 2018
     */
    int updateByPrimaryKeySelective(Finance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FINANCE_C
     *
     * @mbg.generated Mon Jan 08 14:19:28 CST 2018
     */
    int updateByPrimaryKey(Finance record);
}