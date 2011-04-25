package com.dejarvu.spring.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private String userName;
	private String lastName;
	private String firstName;
	
	public User() {
		super();
	}
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public User(String userName, String lastName, String firstName) {
		super();
		this.userName = userName;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", lastName=" + lastName
				+ ", firstName=" + firstName + "]";
	}
}
