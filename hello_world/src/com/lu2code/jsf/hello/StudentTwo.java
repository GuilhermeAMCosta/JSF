package com.lu2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName;
	private String lastName;
	private String country;


	List<String> countryOptions;
	
	// create no-arg constructor
	public StudentTwo() {
		// populate list of countries
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Argentina");
		countryOptions.add("Australia");
		countryOptions.add("Brazil");
		countryOptions.add("Chile");
		countryOptions.add("Dinamark");
		countryOptions.add("France");
		countryOptions.add("Hungary");
		countryOptions.add("Lithuania");
		
	}
	
	
	//getters and setters
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
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}

}
