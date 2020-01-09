package org.hdcd.domain;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = 1710069820531371155L;

	private String userId;
	private String password;

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

}
