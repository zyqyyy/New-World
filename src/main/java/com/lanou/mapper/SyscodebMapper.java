package com.lanou.mapper;

import com.lanou.entity.Syscodeb;

public interface SyscodebMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int deleteByPrimaryKey(String SYS_CODE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int insert(Syscodeb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int insertSelective(Syscodeb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    Syscodeb selectByPrimaryKey(String SYS_CODE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int updateByPrimaryKeySelective(Syscodeb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_CODE_B
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    int updateByPrimaryKey(Syscodeb record);
}