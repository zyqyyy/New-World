package com.lanou.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Packinglistc implements Serializable{
    private String PACKING_LIST_ID;

    private String SELLER;

    private String BUYER;

    private String INVOICE_NO;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date INVOICE_DATE;

    private String MARKS;

    private String DESCRIPTIONS;

    private String EXPORT_IDS;

    private String EXPORT_NOS;

    private Short STATE;

    private String CREATE_BY;

    private String CREATE_DEPT;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date CREATE_TIME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.PACKING_LIST_ID
     *
     * @return the value of PACKING_LIST_C.PACKING_LIST_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getPACKING_LIST_ID() {
        return PACKING_LIST_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.PACKING_LIST_ID
     *
     * @param PACKING_LIST_ID the value for PACKING_LIST_C.PACKING_LIST_ID
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setPACKING_LIST_ID(String PACKING_LIST_ID) {
        this.PACKING_LIST_ID = PACKING_LIST_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.SELLER
     *
     * @return the value of PACKING_LIST_C.SELLER
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getSELLER() {
        return SELLER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.SELLER
     *
     * @param SELLER the value for PACKING_LIST_C.SELLER
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setSELLER(String SELLER) {
        this.SELLER = SELLER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.BUYER
     *
     * @return the value of PACKING_LIST_C.BUYER
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getBUYER() {
        return BUYER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.BUYER
     *
     * @param BUYER the value for PACKING_LIST_C.BUYER
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setBUYER(String BUYER) {
        this.BUYER = BUYER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.INVOICE_NO
     *
     * @return the value of PACKING_LIST_C.INVOICE_NO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getINVOICE_NO() {
        return INVOICE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.INVOICE_NO
     *
     * @param INVOICE_NO the value for PACKING_LIST_C.INVOICE_NO
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setINVOICE_NO(String INVOICE_NO) {
        this.INVOICE_NO = INVOICE_NO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.INVOICE_DATE
     *
     * @return the value of PACKING_LIST_C.INVOICE_DATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Date getINVOICE_DATE() {
        return INVOICE_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.INVOICE_DATE
     *
     * @param INVOICE_DATE the value for PACKING_LIST_C.INVOICE_DATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setINVOICE_DATE(Date INVOICE_DATE) {
        this.INVOICE_DATE = INVOICE_DATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.MARKS
     *
     * @return the value of PACKING_LIST_C.MARKS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getMARKS() {
        return MARKS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.MARKS
     *
     * @param MARKS the value for PACKING_LIST_C.MARKS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setMARKS(String MARKS) {
        this.MARKS = MARKS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.DESCRIPTIONS
     *
     * @return the value of PACKING_LIST_C.DESCRIPTIONS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getDESCRIPTIONS() {
        return DESCRIPTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.DESCRIPTIONS
     *
     * @param DESCRIPTIONS the value for PACKING_LIST_C.DESCRIPTIONS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setDESCRIPTIONS(String DESCRIPTIONS) {
        this.DESCRIPTIONS = DESCRIPTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.EXPORT_IDS
     *
     * @return the value of PACKING_LIST_C.EXPORT_IDS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getEXPORT_IDS() {
        return EXPORT_IDS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.EXPORT_IDS
     *
     * @param EXPORT_IDS the value for PACKING_LIST_C.EXPORT_IDS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setEXPORT_IDS(String EXPORT_IDS) {
        this.EXPORT_IDS = EXPORT_IDS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.EXPORT_NOS
     *
     * @return the value of PACKING_LIST_C.EXPORT_NOS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getEXPORT_NOS() {
        return EXPORT_NOS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.EXPORT_NOS
     *
     * @param EXPORT_NOS the value for PACKING_LIST_C.EXPORT_NOS
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setEXPORT_NOS(String EXPORT_NOS) {
        this.EXPORT_NOS = EXPORT_NOS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.STATE
     *
     * @return the value of PACKING_LIST_C.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Short getSTATE() {
        return STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.STATE
     *
     * @param STATE the value for PACKING_LIST_C.STATE
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setSTATE(Short STATE) {
        this.STATE = STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.CREATE_BY
     *
     * @return the value of PACKING_LIST_C.CREATE_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCREATE_BY() {
        return CREATE_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.CREATE_BY
     *
     * @param CREATE_BY the value for PACKING_LIST_C.CREATE_BY
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.CREATE_DEPT
     *
     * @return the value of PACKING_LIST_C.CREATE_DEPT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public String getCREATE_DEPT() {
        return CREATE_DEPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.CREATE_DEPT
     *
     * @param CREATE_DEPT the value for PACKING_LIST_C.CREATE_DEPT
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATE_DEPT(String CREATE_DEPT) {
        this.CREATE_DEPT = CREATE_DEPT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PACKING_LIST_C.CREATE_TIME
     *
     * @return the value of PACKING_LIST_C.CREATE_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PACKING_LIST_C.CREATE_TIME
     *
     * @param CREATE_TIME the value for PACKING_LIST_C.CREATE_TIME
     *
     * @mbg.generated Fri Jan 05 15:47:01 CST 2018
     */
    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }
}