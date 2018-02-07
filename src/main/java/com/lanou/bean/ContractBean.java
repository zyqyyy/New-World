package com.lanou.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContractBean implements Serializable{
	
	private String CONTRACT_ID;
	private String CONTRACT_NO;
	private String CUSTOM_NAME;
	private Date DELIVERY_PERIOD;
	private Date SHIP_TIME;
	private Date SIGNING_DATE;
	private BigDecimal TOTAL_AMOUNT;
	private Short STATE;
	private Integer CNUMBER;
	private Integer expNum;
	
	
	public Date getSIGNING_DATE() {
		return SIGNING_DATE;
	}
	public void setSIGNING_DATE(Date sIGNING_DATE) {
		SIGNING_DATE = sIGNING_DATE;
	}
	public String getCONTRACT_ID() {
		return CONTRACT_ID;
	}
	public void setCONTRACT_ID(String cONTRACT_ID) {
		CONTRACT_ID = cONTRACT_ID;
	}
	public String getCONTRACT_NO() {
		return CONTRACT_NO;
	}
	public void setCONTRACT_NO(String cONTRACT_NO) {
		CONTRACT_NO = cONTRACT_NO;
	}
	public String getCUSTOM_NAME() {
		return CUSTOM_NAME;
	}
	public void setCUSTOM_NAME(String cUSTOM_NAME) {
		CUSTOM_NAME = cUSTOM_NAME;
	}
	public Date getDELIVERY_PERIOD() {
		return DELIVERY_PERIOD;
	}
	public void setDELIVERY_PERIOD(Date dELIVERY_PERIOD) {
		DELIVERY_PERIOD = dELIVERY_PERIOD;
	}
	public Date getSHIP_TIME() {
		return SHIP_TIME;
	}
	public void setSHIP_TIME(Date sHIP_TIME) {
		SHIP_TIME = sHIP_TIME;
	}
	public BigDecimal getTOTAL_AMOUNT() {
		return TOTAL_AMOUNT;
	}
	public void setTOTAL_AMOUNT(BigDecimal tOTAL_AMOUNT) {
		TOTAL_AMOUNT = tOTAL_AMOUNT;
	}
	public Short getSTATE() {
		return STATE;
	}
	public void setSTATE(Short sTATE) {
		STATE = sTATE;
	}
	public Integer getCNUMBER() {
		return CNUMBER;
	}
	public void setCNUMBER(Integer cNUMBER) {
		CNUMBER = cNUMBER;
	}
	public Integer getExpNum() {
		return expNum;
	}
	public void setExpNum(Integer expNum) {
		this.expNum = expNum;
	}
	
	
    
    

}
