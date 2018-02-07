package com.lanou.bean;

import java.io.Serializable;




public class OutProductBean implements Serializable{

	private String contract_product_id;
	private String custom_name;
	private String contract_no;
	private String delivery_period;
	private String ship_time;
	private String trade_terms;
	private String factory_name;
	private String product_no;
	private String cnumber;
	public String getContract_product_id() {
		return contract_product_id;
	}
	public void setContract_product_id(String contract_product_id) {
		this.contract_product_id = contract_product_id;
	}
	public String getCustom_name() {
		return custom_name;
	}
	public void setCustom_name(String custom_name) {
		this.custom_name = custom_name;
	}
	public String getContract_no() {
		return contract_no;
	}
	public void setContract_no(String contract_no) {
		this.contract_no = contract_no;
	}

	public String getDelivery_period() {
		return delivery_period;
	}
	public void setDelivery_period(String delivery_period) {
		this.delivery_period = delivery_period;
	}
	public String getShip_time() {
		return ship_time;
	}
	public void setShip_time(String ship_time) {
		this.ship_time = ship_time;
	}
	public String getTrade_terms() {
		return trade_terms;
	}
	public void setTrade_terms(String trade_terms) {
		this.trade_terms = trade_terms;
	}
	public String getFactory_name() {
		return factory_name;
	}
	public void setFactory_name(String factory_name) {
		this.factory_name = factory_name;
	}
	public String getProduct_no() {
		return product_no;
	}
	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	
	

	
	

}
