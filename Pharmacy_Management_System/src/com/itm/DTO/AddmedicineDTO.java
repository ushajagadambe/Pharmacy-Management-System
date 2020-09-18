package com.itm.DTO;

import java.util.Date;

public class AddmedicineDTO {
private String name;
private Date mdate;
private Date edate;
private int power;
private int price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getMdate() {
	return mdate;
}
public void setMdate(Date mdate) {
	this.mdate = mdate;
}
public Date getEdate() {
	return edate;
}
public void setEdate(Date edate) {
	this.edate = edate;
}
public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
