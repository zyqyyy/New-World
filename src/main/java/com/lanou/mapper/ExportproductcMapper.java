package com.lanou.mapper;

import com.lanou.entity.Exportproductc;

public interface ExportproductcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int deleteByPrimaryKey(String EXPORT_PRODUCT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int insert(Exportproductc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int insertSelective(Exportproductc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    Exportproductc selectByPrimaryKey(String EXPORT_PRODUCT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int updateByPrimaryKeySelective(Exportproductc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPORT_PRODUCT_C
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int updateByPrimaryKey(Exportproductc record);
}