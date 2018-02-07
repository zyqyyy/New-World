package com.lanou.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Exportc implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.EXPORT_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String EXPORT_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.INPUT_DATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date INPUT_DATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.CONTRACT_IDS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CONTRACT_IDS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.CUSTOMER_CONTRACT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CUSTOMER_CONTRACT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.LCNO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String LCNO;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.CONSIGNEE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CONSIGNEE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.MARKS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String MARKS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.REMARK
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String REMARK;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.SHIPMENT_PORT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String SHIPMENT_PORT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.DESTINATION_PORT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String DESTINATION_PORT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.TRANSPORT_MODE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String TRANSPORT_MODE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.PRICE_CONDITION
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String PRICE_CONDITION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private Short STATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.GROSS_WEIGHT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private BigDecimal GROSS_WEIGHT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.NET_WEIGHT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private BigDecimal NET_WEIGHT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.MEASUREMENT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private BigDecimal MEASUREMENT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.CREATE_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CREATE_BY;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.CREATE_DEPT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    private String CREATE_DEPT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EXPORT_C.CREATE_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date CREATE_TIME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.EXPORT_ID
     *
     * @return the value of EXPORT_C.EXPORT_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getEXPORT_ID() {
        return EXPORT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.EXPORT_ID
     *
     * @param EXPORT_ID the value for EXPORT_C.EXPORT_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setEXPORT_ID(String EXPORT_ID) {
        this.EXPORT_ID = EXPORT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.INPUT_DATE
     *
     * @return the value of EXPORT_C.INPUT_DATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Date getINPUT_DATE() {
        return INPUT_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.INPUT_DATE
     *
     * @param INPUT_DATE the value for EXPORT_C.INPUT_DATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setINPUT_DATE(Date INPUT_DATE) {
        this.INPUT_DATE = INPUT_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.CONTRACT_IDS
     *
     * @return the value of EXPORT_C.CONTRACT_IDS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCONTRACT_IDS() {
        return CONTRACT_IDS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.CONTRACT_IDS
     *
     * @param CONTRACT_IDS the value for EXPORT_C.CONTRACT_IDS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCONTRACT_IDS(String CONTRACT_IDS) {
        this.CONTRACT_IDS = CONTRACT_IDS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.CUSTOMER_CONTRACT
     *
     * @return the value of EXPORT_C.CUSTOMER_CONTRACT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCUSTOMER_CONTRACT() {
        return CUSTOMER_CONTRACT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.CUSTOMER_CONTRACT
     *
     * @param CUSTOMER_CONTRACT the value for EXPORT_C.CUSTOMER_CONTRACT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCUSTOMER_CONTRACT(String CUSTOMER_CONTRACT) {
        this.CUSTOMER_CONTRACT = CUSTOMER_CONTRACT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.LCNO
     *
     * @return the value of EXPORT_C.LCNO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getLCNO() {
        return LCNO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.LCNO
     *
     * @param LCNO the value for EXPORT_C.LCNO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setLCNO(String LCNO) {
        this.LCNO = LCNO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.CONSIGNEE
     *
     * @return the value of EXPORT_C.CONSIGNEE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCONSIGNEE() {
        return CONSIGNEE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.CONSIGNEE
     *
     * @param CONSIGNEE the value for EXPORT_C.CONSIGNEE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCONSIGNEE(String CONSIGNEE) {
        this.CONSIGNEE = CONSIGNEE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.MARKS
     *
     * @return the value of EXPORT_C.MARKS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getMARKS() {
        return MARKS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.MARKS
     *
     * @param MARKS the value for EXPORT_C.MARKS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setMARKS(String MARKS) {
        this.MARKS = MARKS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.REMARK
     *
     * @return the value of EXPORT_C.REMARK
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getREMARK() {
        return REMARK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.REMARK
     *
     * @param REMARK the value for EXPORT_C.REMARK
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.SHIPMENT_PORT
     *
     * @return the value of EXPORT_C.SHIPMENT_PORT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getSHIPMENT_PORT() {
        return SHIPMENT_PORT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.SHIPMENT_PORT
     *
     * @param SHIPMENT_PORT the value for EXPORT_C.SHIPMENT_PORT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setSHIPMENT_PORT(String SHIPMENT_PORT) {
        this.SHIPMENT_PORT = SHIPMENT_PORT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.DESTINATION_PORT
     *
     * @return the value of EXPORT_C.DESTINATION_PORT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getDESTINATION_PORT() {
        return DESTINATION_PORT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.DESTINATION_PORT
     *
     * @param DESTINATION_PORT the value for EXPORT_C.DESTINATION_PORT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setDESTINATION_PORT(String DESTINATION_PORT) {
        this.DESTINATION_PORT = DESTINATION_PORT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.TRANSPORT_MODE
     *
     * @return the value of EXPORT_C.TRANSPORT_MODE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getTRANSPORT_MODE() {
        return TRANSPORT_MODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.TRANSPORT_MODE
     *
     * @param TRANSPORT_MODE the value for EXPORT_C.TRANSPORT_MODE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setTRANSPORT_MODE(String TRANSPORT_MODE) {
        this.TRANSPORT_MODE = TRANSPORT_MODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.PRICE_CONDITION
     *
     * @return the value of EXPORT_C.PRICE_CONDITION
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getPRICE_CONDITION() {
        return PRICE_CONDITION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.PRICE_CONDITION
     *
     * @param PRICE_CONDITION the value for EXPORT_C.PRICE_CONDITION
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setPRICE_CONDITION(String PRICE_CONDITION) {
        this.PRICE_CONDITION = PRICE_CONDITION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.STATE
     *
     * @return the value of EXPORT_C.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Short getSTATE() {
        return STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.STATE
     *
     * @param STATE the value for EXPORT_C.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setSTATE(Short STATE) {
        this.STATE = STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.GROSS_WEIGHT
     *
     * @return the value of EXPORT_C.GROSS_WEIGHT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public BigDecimal getGROSS_WEIGHT() {
        return GROSS_WEIGHT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.GROSS_WEIGHT
     *
     * @param GROSS_WEIGHT the value for EXPORT_C.GROSS_WEIGHT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setGROSS_WEIGHT(BigDecimal GROSS_WEIGHT) {
        this.GROSS_WEIGHT = GROSS_WEIGHT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.NET_WEIGHT
     *
     * @return the value of EXPORT_C.NET_WEIGHT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public BigDecimal getNET_WEIGHT() {
        return NET_WEIGHT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.NET_WEIGHT
     *
     * @param NET_WEIGHT the value for EXPORT_C.NET_WEIGHT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setNET_WEIGHT(BigDecimal NET_WEIGHT) {
        this.NET_WEIGHT = NET_WEIGHT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.MEASUREMENT
     *
     * @return the value of EXPORT_C.MEASUREMENT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public BigDecimal getMEASUREMENT() {
        return MEASUREMENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.MEASUREMENT
     *
     * @param MEASUREMENT the value for EXPORT_C.MEASUREMENT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setMEASUREMENT(BigDecimal MEASUREMENT) {
        this.MEASUREMENT = MEASUREMENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.CREATE_BY
     *
     * @return the value of EXPORT_C.CREATE_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCREATE_BY() {
        return CREATE_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.CREATE_BY
     *
     * @param CREATE_BY the value for EXPORT_C.CREATE_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.CREATE_DEPT
     *
     * @return the value of EXPORT_C.CREATE_DEPT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCREATE_DEPT() {
        return CREATE_DEPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.CREATE_DEPT
     *
     * @param CREATE_DEPT the value for EXPORT_C.CREATE_DEPT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATE_DEPT(String CREATE_DEPT) {
        this.CREATE_DEPT = CREATE_DEPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EXPORT_C.CREATE_TIME
     *
     * @return the value of EXPORT_C.CREATE_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EXPORT_C.CREATE_TIME
     *
     * @param CREATE_TIME the value for EXPORT_C.CREATE_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }
}