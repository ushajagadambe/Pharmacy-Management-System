package com.itm.DTO;

public class CustomerRegDTO {
	private String name;
	private String password;
	private String address;
	private long phone;
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	public long getPhone() {
		return phone;
	}
	
}
