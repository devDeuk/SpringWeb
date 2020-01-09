package org.hdcd.domain;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable{
	
	private String userId = "hongkd";
	
	private String password = "1234";

	private Date dateOfBirth;

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
