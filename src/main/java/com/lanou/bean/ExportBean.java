package com.lanou.bean;

import java.io.Serializable;
import java.util.Date;

public class ExportBean implements Serializable{

	private String export_id;
	private String customer_contract;
	private String lcno;
	private Integer cnumber;
	private Integer expNum;
	private String shipment_port;
	private String consignee;
	private String transport_mode;
	private String price_condition;
	private Date input_date;
	private String state;
	
	
	public String getLcno() {
		return lcno;
	}
	public void setLcno(String lcno) {
		this.lcno = lcno;
	}
	public String getExport_id() {
		return export_id;
	}
	public void setExport_id(String export_id) {
		this.export_id = export_id;
	}
	public String getCustomer_contract() {
		return customer_contract;
	}
	public void setCustomer_contract(String customer_contract) {
		this.customer_contract = customer_contract;
	}

	public Integer getCnumber() {
		return cnumber;
	}
	public void setCnumber(Integer cnumber) {
		this.cnumber = cnumber;
	}
	public Integer getExpNum() {
		return expNum;
	}
	public void setExpNum(Integer expNum) {
		this.expNum = expNum;
	}
	public String getShipment_port() {
		return shipment_port;
	}
	public void setShipment_port(String shipment_port) {
		this.shipment_port = shipment_port;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getTransport_mode() {
		return transport_mode;
	}
	public void setTransport_mode(String transport_mode) {
		this.transport_mode = transport_mode;
	}
	public String getPrice_condition() {
		return price_condition;
	}
	public void setPrice_condition(String price_condition) {
		this.price_condition = price_condition;
	}
	
	public Date getInput_date() {
		return input_date;
	}
	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
