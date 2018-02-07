package com.lanou.entity;

import java.io.Serializable;
import java.util.Date;

public class Syscodeb implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.SYS_CODE_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String SYS_CODE_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.NAME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.PARENT_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String PARENT_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.PARENT_NAME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String PARENT_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.LAYER_NUM
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Short LAYER_NUM;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.IS_LEAF
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Short IS_LEAF;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.QUOTE_NUM
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Short QUOTE_NUM;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.CNOTE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CNOTE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.ICO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String ICO;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.ORDER_NO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Short ORDER_NO;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String STATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.CREATED_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CREATED_BY;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.CREATED_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Date CREATED_TIME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.UPDATED_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String UPDATED_BY;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_CODE_B.UPDATED_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Date UPDATED_TIME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.SYS_CODE_ID
     *
     * @return the value of SYS_CODE_B.SYS_CODE_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getSYS_CODE_ID() {
        return SYS_CODE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.SYS_CODE_ID
     *
     * @param SYS_CODE_ID the value for SYS_CODE_B.SYS_CODE_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setSYS_CODE_ID(String SYS_CODE_ID) {
        this.SYS_CODE_ID = SYS_CODE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.NAME
     *
     * @return the value of SYS_CODE_B.NAME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.NAME
     *
     * @param NAME the value for SYS_CODE_B.NAME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.PARENT_ID
     *
     * @return the value of SYS_CODE_B.PARENT_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getPARENT_ID() {
        return PARENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.PARENT_ID
     *
     * @param PARENT_ID the value for SYS_CODE_B.PARENT_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setPARENT_ID(String PARENT_ID) {
        this.PARENT_ID = PARENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.PARENT_NAME
     *
     * @return the value of SYS_CODE_B.PARENT_NAME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getPARENT_NAME() {
        return PARENT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.PARENT_NAME
     *
     * @param PARENT_NAME the value for SYS_CODE_B.PARENT_NAME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setPARENT_NAME(String PARENT_NAME) {
        this.PARENT_NAME = PARENT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.LAYER_NUM
     *
     * @return the value of SYS_CODE_B.LAYER_NUM
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Short getLAYER_NUM() {
        return LAYER_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.LAYER_NUM
     *
     * @param LAYER_NUM the value for SYS_CODE_B.LAYER_NUM
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setLAYER_NUM(Short LAYER_NUM) {
        this.LAYER_NUM = LAYER_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.IS_LEAF
     *
     * @return the value of SYS_CODE_B.IS_LEAF
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Short getIS_LEAF() {
        return IS_LEAF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.IS_LEAF
     *
     * @param IS_LEAF the value for SYS_CODE_B.IS_LEAF
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setIS_LEAF(Short IS_LEAF) {
        this.IS_LEAF = IS_LEAF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.QUOTE_NUM
     *
     * @return the value of SYS_CODE_B.QUOTE_NUM
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Short getQUOTE_NUM() {
        return QUOTE_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.QUOTE_NUM
     *
     * @param QUOTE_NUM the value for SYS_CODE_B.QUOTE_NUM
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setQUOTE_NUM(Short QUOTE_NUM) {
        this.QUOTE_NUM = QUOTE_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.CNOTE
     *
     * @return the value of SYS_CODE_B.CNOTE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCNOTE() {
        return CNOTE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.CNOTE
     *
     * @param CNOTE the value for SYS_CODE_B.CNOTE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCNOTE(String CNOTE) {
        this.CNOTE = CNOTE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.ICO
     *
     * @return the value of SYS_CODE_B.ICO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getICO() {
        return ICO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.ICO
     *
     * @param ICO the value for SYS_CODE_B.ICO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setICO(String ICO) {
        this.ICO = ICO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.ORDER_NO
     *
     * @return the value of SYS_CODE_B.ORDER_NO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Short getORDER_NO() {
        return ORDER_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.ORDER_NO
     *
     * @param ORDER_NO the value for SYS_CODE_B.ORDER_NO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setORDER_NO(Short ORDER_NO) {
        this.ORDER_NO = ORDER_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.STATE
     *
     * @return the value of SYS_CODE_B.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getSTATE() {
        return STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.STATE
     *
     * @param STATE the value for SYS_CODE_B.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.CREATED_BY
     *
     * @return the value of SYS_CODE_B.CREATED_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.CREATED_BY
     *
     * @param CREATED_BY the value for SYS_CODE_B.CREATED_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.CREATED_TIME
     *
     * @return the value of SYS_CODE_B.CREATED_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Date getCREATED_TIME() {
        return CREATED_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.CREATED_TIME
     *
     * @param CREATED_TIME the value for SYS_CODE_B.CREATED_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATED_TIME(Date CREATED_TIME) {
        this.CREATED_TIME = CREATED_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.UPDATED_BY
     *
     * @return the value of SYS_CODE_B.UPDATED_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getUPDATED_BY() {
        return UPDATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.UPDATED_BY
     *
     * @param UPDATED_BY the value for SYS_CODE_B.UPDATED_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setUPDATED_BY(String UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_CODE_B.UPDATED_TIME
     *
     * @return the value of SYS_CODE_B.UPDATED_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Date getUPDATED_TIME() {
        return UPDATED_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_CODE_B.UPDATED_TIME
     *
     * @param UPDATED_TIME the value for SYS_CODE_B.UPDATED_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setUPDATED_TIME(Date UPDATED_TIME) {
        this.UPDATED_TIME = UPDATED_TIME;
    }
}