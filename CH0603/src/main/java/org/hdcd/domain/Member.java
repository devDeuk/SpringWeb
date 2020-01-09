package org.hdcd.domain;

import java.io.Serializable;

public class Member implements Serializable{

	private static final long serialVersionUID = 1710069820531371155L;
	
	private String userId;
	private String password;
	
	private String userName;
	
	private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
