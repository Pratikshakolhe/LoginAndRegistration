package com.fujitsu.loginAndRegister.model;

public class User {
	
	int id;
	String userName;
	String password;
	int phone;
	String address;
	public User(int id, String userName, String password, int phone, String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	 	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	

}
