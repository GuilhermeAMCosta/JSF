package com.lu2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	
	// create no-arg constructor
	public Student() {
		
	}
	// getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
