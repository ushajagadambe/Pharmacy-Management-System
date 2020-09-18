package com.itm.DTO;

public class PlaceOrderDTO {
private String med_name;
private int quantity;
private String cust_name;
public String getMed_name() {
	return med_name;
}
public void setMed_name(String med_name) {
	this.med_name = med_name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
}
