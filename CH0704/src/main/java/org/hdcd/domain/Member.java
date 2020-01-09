package org.hdcd.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Member implements Serializable {

	private static final long serialVersionUID = 1710069820531371155L;

	private String userId;
	private String password;

	private String userName;

	private String email;
	
	private Date dateOfBirth;
	
	private Address address;

	private List<Card> cardList;
	
	private String[] hobbyArray;
	private List<String> hobbyList;

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}

	public String[] getHobbyArray() {
		return hobbyArray;
	}

	public void setHobbyArray(String[] hobbyArray) {
		this.hobbyArray = hobbyArray;
	}

	public List<String> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}

}
