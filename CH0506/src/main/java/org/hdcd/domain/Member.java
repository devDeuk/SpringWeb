package org.hdcd.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Member implements Serializable{

	private static final long serialVersionUID = 4527726895301852513L;

	private String userId = "hongkd";
	
	private String password = "1234";

	@DateTimeFormat(pattern="yyyyMMdd")
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
