package org.hdcd.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class Address implements Serializable {

	private static final long serialVersionUID = -2077443008943275545L;

	@NotBlank
	private String postCode;

	@NotBlank
	private String location;

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
