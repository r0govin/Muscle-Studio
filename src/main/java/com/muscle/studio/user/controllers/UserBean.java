package com.muscle.studio.user.controllers;

public class UserBean {
	String userName;
	String name;
	String password;
	
	public UserBean(String userName, String name, String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", name=" + name + ", password=" + password + "]";
	}
	
}
